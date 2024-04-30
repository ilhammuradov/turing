package az.edu.turing.module01.miniproject1;

import java.util.*;

public class Family {

    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;

    public Family(Human mother, Human father, List<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
    }

    public boolean deleteChild(int index) {
        if (children == null || index < 0 || index >= children.size()) {
            return false;
        }
        children.remove(index);
        return true;
    }

    public int countFamily() {
        return children.size() + 2;
    }

    String prettyFormat(){
        StringBuilder sb = new StringBuilder();

        sb.append("family :\n\t\t");
        sb.append( "mother : " + mother + "\n\t\t");
        sb.append("father : " + getFather() + "\n\t\t");
        sb.append("children :\n\t\t\t\t");
        getChildren().stream().filter(x->x instanceof Man).forEach(child->sb.append("boy : " + child + "\n\t\t\t\t"));
        getChildren().stream().filter(x->x instanceof Woman).forEach(child->sb.append("girl : " +child +"\n\t\t\t\t"));

        sb.append("\n\t\tpets : " + getPet());

        return sb.toString();

}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pet);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}
