package hw10.service;

import hw10.dao.CollectionFamilyDao;
import hw10.entity.Family;
import hw10.entity.Human;
import hw10.entity.Pet;

import java.util.*;

public class FamilyService {
  CollectionFamilyDao familyDao = new CollectionFamilyDao();

  public List<Family> getAllFamilies(){
    return familyDao.getAllFamilies();
  }

  public void displayAllFamilies(){
    int i = 0;
    for (Family f: getAllFamilies()) {
      i++;
      System.out.println(i + ") " + f.toString());
    }
  }

  public void getFamiliesBiggerThan(int number){
    for (Family f: getAllFamilies()) {
      if (f.countFamily() > number)
        System.out.println(f.toString());
    }

  }

  public void getFamiliesLessThan(int number){
    for (Family f: getAllFamilies()) {
      if (f.countFamily() < number)
        System.out.println(f.toString());
    }

  }

  public void countFamiliesWithMemberNumber(int number){
    for (Family f: getAllFamilies()) {
      if (f.countFamily() == number)
        System.out.println(f.toString());
    }
  }

  public void createNewFamily(Human father, Human mother){
    Family family = new Family(father, mother);
    familyDao.saveFamily(family);
  }

  public void saveFamily(Family family){
    familyDao.saveFamily(family);
  }

  public void deleteFamilyByIndex(int index){
    familyDao.deleteFamily(index);
  }

  public Family bornChild(Family family, String girlName, String boyName){
    Random random = new Random();
    int num = random.nextInt(2);
    String name = "";
    if (num == 0) name = girlName;
    if (num == 1) name = boyName;
    Human child = new Human(name, "surname", "12/12/2020");
    List<Human> children = new ArrayList<>();
    children.add(child);
    family.setChildren(children);
    return family;
  }

  public Family adoptChild(Family family, Human child){
    List<Human> children = new ArrayList<>(family.getChildren());
    children.add(child);
    family.setChildren(children);
    return family;
  }

  public void deleteAllChildrenOlderThen(int age){
    List<Family> families = new ArrayList<>(getAllFamilies());
    for (Family f: families){
      List<Human> children = new ArrayList<>(f.getChildren());
      List<Human> childrenNew = new ArrayList<>();
      for (Human child: children){
        if (child.getYear() <= age) {
          childrenNew.add(child);
        }
      }
      f.setChildren(childrenNew);
    }
  }

  public int count(){
    return getAllFamilies().size();
  }

  public Family getFamilyById(int index){
    return getAllFamilies().get(index);
  }

  public List<Pet> getPets(int index){
    return new ArrayList<>(getAllFamilies().get(index).getPet());
  }

  public void addPet(int index, Pet pet){
    Family f = getAllFamilies().get(index);
    Set<Pet> pets = new HashSet<>(f.getPet());
    pets.add(pet);
    f.setPet(pets);
  }

}
