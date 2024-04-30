package az.edu.turing.module01.miniproject1;

import java.util.List;
import java.util.Set;

public class FamilyService {

    private FamilyDAO familyDao;

    public FamilyService(FamilyDAO familyDAO) {
        this.familyDao = familyDAO;
    }

    public void loadData(List<Family> families){
        familyDao.loadData(families);
    }

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int numberOfPeople) {
        return familyDao.getFamiliesBiggerThan(numberOfPeople);
    }

    public List<Family> getFamiliesLessThan(int numberOfPeople) {
        return familyDao.getFamiliesLessThan(numberOfPeople);
    }

    public int countFamiliesWithMemberNumber(int numberOfPeople) {
        return familyDao.countFamiliesWithMemberNumber(numberOfPeople);
    }

    public Family createNewFamily(Human mother, Human father) {
        return familyDao.createNewFamily(mother, father);
    }

    public boolean deleteFamily(int index) {
        return familyDao.deleteFamily(index);
    }

    public Family bornChild(Family family, String name, String gender) {
        return familyDao.bornChild(family, name, gender);
    }

    public Family adoptChild(Family family, Human child) {
        return familyDao.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyDao.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return familyDao.count();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int familyIndex) {
        return familyDao.getPets(familyIndex);
    }

    public void addPet(int familyIndex, Pet pet) {
        familyDao.addPet(familyIndex, pet);
    }

   public void displayAllFamilies(){
        familyDao.getAllFamilies().stream().forEach(x-> System.out.println(x.prettyFormat()));
   }
}
