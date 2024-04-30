package az.edu.turing.module01.miniproject1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.io.*;

public class CollectionFamilyDAO implements FamilyDAO {

    private static final String RESOURCE = "src/main/java/az/edu/turing/module01/miniproject1/resource/";

    private static final String DATABASE = RESOURCE + "database.txt";

    private  List<Family> families=new ArrayList<>();

    public CollectionFamilyDAO(List<Family> families) {
        this.families = families;
    }

    public CollectionFamilyDAO() {

    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    @Override
    public void loadData(List<Family> families) {
        File file = new File(DATABASE);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DATABASE));){

            getAllFamilies().forEach(x-> {
                String string = x.toString();
                try {
                    bw.write(string+"\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedReader br = new BufferedReader(new FileReader(DATABASE));){

            String s = "";
            StringBuilder sb = new StringBuilder();
            while((s = br.readLine())!=null){
                sb.append(s+"\n");
            }
            System.out.println(sb);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Family> getAllFamilies() {
        return families ;
    }

    @Override
    public Family getFamilyByIndex(int id) {
        if (id>=0 && id< families.size()){
            return families.get(id);
        }else return null;
    }

    @Override
    public boolean deleteFamily(int id) {
        if (id>=0 && id< families.size()){
            families.remove(id);
            return true;
        }else return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        if (families.contains(family)){
            int id=families.indexOf(family);
            families.set(id,family);
        }else families.add(family);
    }

    @Override
    public List<Family> getFamiliesBiggerThan(int numberOfPeople) {
        return getAllFamilies().stream().filter(x->x.countFamily()>numberOfPeople).collect(Collectors.toList());
    }


    @Override
    public List<Family> getFamiliesLessThan(int numberOfPeople) {
        return getAllFamilies().stream().filter(x->x.countFamily() < numberOfPeople).collect(Collectors.toList());
    }


    @Override
    public int countFamiliesWithMemberNumber(int numberOfPeople) {
        return (int) getAllFamilies().stream().filter(x->x.countFamily() == numberOfPeople).count();
}

    @Override
    public Family createNewFamily(Human mother, Human father) {
        Family newFamily = new Family(mother, father, new ArrayList<>());
        saveFamily(newFamily);
        return newFamily;
    }


    @Override
    public Family bornChild(Family family, String name, String gender) {
        Human child;
        long currentMillis = System.currentTimeMillis();
        if (gender.equalsIgnoreCase("male")) {
            child = new Human(name, family.getFather().getSurname(), currentMillis);
        } else {
            child = new Human(name, family.getMother().getSurname(), currentMillis);
        }
        family.addChild(child);
        saveFamily(family);
        return family;
    }


    @Override
    public Family adoptChild(Family family, Human child) {
        if(family.countFamily() >= 5){
            throw new FamilyOverFlowException("Family size exceeded!");
        }
        family.addChild(child);
        return family;
}

    @Override
    public void deleteAllChildrenOlderThan(int age) {
        getAllFamilies().stream().forEach(x->x.getChildren().removeIf(child->child.getBirthYear()>age));
}

    @Override
    public int count() {
        return families.size();
    }

    @Override
    public Set<Pet> getPets(int familyIndex) {
        Family family = getFamilyByIndex(familyIndex);
        if (family != null) {
            return family.getPet();
        }
        return null;
    }

    @Override
    public void addPet(int familyIndex, Pet pet) {
        Family family = getFamilyByIndex(familyIndex);
        if (family != null) {
            family.setPet((Set<Pet>) pet);
            saveFamily(family);
        }
    }


}
