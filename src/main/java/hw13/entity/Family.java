package hw13.entity;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Family {

  private Human mother;
  private Human father;
  private List<Human> children = null;
  private int childIndex = 0;
  private Set<Pet> pets;

  public Family(Human mother, Human father, List<Human> children) {
    this.mother = mother;
    this.father = father;
    this.children = children;
  }

  public Family(Human mother, Human father) {
    this.mother = mother;
    this.father = father;
  }

  public Family(Human mother, Human father, List<Human> children, Set<Pet> pets) {
    this.mother = mother;
    this.father = father;
    this.children = children;
    this.pets = pets;
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

  public int getChildIndex() {
    return childIndex;
  }

  public void setChildIndex(int childIndex) {
    this.childIndex = childIndex;
  }

  public Set<Pet> getPet() {
    return pets;
  }

  public void setPet(Set<Pet> pets) {
    this.pets = pets;
  }

  int addChild(Human child) {
    children.add(child);
    return children.size();
  }

  boolean deleteChild(int index) {
    if (index <= children.size()-1) {
      children.remove(index);
      return true;
    }
    else return false;
  }


  boolean deleteChild(Human child) {
    if (children.contains(child)) {
      children.remove(children.indexOf(child));
      return true;
    }
    else return false;
  }

  public int countFamily() {
    return childIndex+2;
  }

  @Override
  public String toString() {
    return "Family{" + "mother=" + mother.getName() + " " + mother.getSurname() + ", father=" + father.getName() + " " + father.getSurname() +
        ", \nchildren=" + children + ",\n pet=" + pets + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Family family = (Family) o;
    return childIndex == family.childIndex &&
        mother.equals(family.mother) &&
        father.equals(family.father) &&
        (children == family.children);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(mother, father, childIndex);
    result = 20 * result + children.hashCode();
    return result;
  }

}