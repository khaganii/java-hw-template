package hw06;
import java.util.Arrays;
import java.util.Objects;

public class Family {

  private Human mother;
  private Human father;
  private Human[] children;
  private int childIndex = 0;
  private Pet pet;

  public Family(Human mother, Human father, Human[] children) {
    this.mother = mother;
    this.father = father;
    this.children = children;
  }

  public Family(Human mother, Human father, Human[] children, Pet pet) {
    this.mother = mother;
    this.father = father;
    this.children = children;
    this.pet = pet;
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

  public Human[] getChildren() {
    return children;
  }

  public void setChildren(Human[] children) {
    this.children = children;
  }

  public int getChildIndex() {
    return childIndex;
  }

  public void setChildIndex(int childIndex) {
    this.childIndex = childIndex;
  }

  public Pet getPet() {
    return pet;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }

  int addChild(Human child) {
    children = Arrays.copyOf(children, childIndex + 1);
    children[childIndex] = child;
    childIndex++;
    return childIndex;
  }

  boolean deleteChild(int index) {
    if (children[index] != null){
      if (children.length - 1 - index >= 0)
        System.arraycopy(children, index + 1, children, index, children.length - 1 - index);
      childIndex--;
      return true;
    }
    children= Arrays.copyOf(children, childIndex);
    return false;
  }


  boolean deleteChild(Human child) {
    int index = children.length;
    for (int i = 0; i < children.length; i++) {
      if (children[i] == child) index = i;
    }
    try{
      if (children[index] != null){
        for (int i = index; i < children.length-1; i++) {
          children[i] = children[i+1];
        }
        childIndex--;
        children= Arrays.copyOf(children, childIndex);
        return true;
      }
    }
    catch(Exception e) {
      System.out.println("Child not found!");
    }
    return false;
  }

  int countFamily() {
    return childIndex+2;
  }

  @Override
  public String toString() {
    children = Arrays.copyOf(children, childIndex);
    return "Family{" + "mother=" + mother.getName() + " " + mother.getSurname() + ", father=" + father.getName() + " " + father.getSurname() +
        ", children=" + Arrays.toString(children) + ", pet=" + pet + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Family family = (Family) o;
    return childIndex == family.childIndex &&
        mother.equals(family.mother) &&
        father.equals(family.father) &&
        Arrays.equals(children, family.children) &&
        pet.getNickname().equals(family.pet.getNickname())&&
        pet.getSpecies().equals(family.pet.getSpecies());
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(mother, father, childIndex);
    result = 20 * result + Arrays.hashCode(children);
    return result;
  }

}