package hw12.service;

import hw12.dao.CollectionFamilyDao;
import hw12.entity.Family;
import hw12.entity.Human;
import hw12.entity.Pet;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class FamilyService {
  CollectionFamilyDao familyDao = new CollectionFamilyDao();

  public List<Family> getAllFamilies(){
    return familyDao.getAllFamilies();
  }

  public String displayAllFamilies(){
    return familyDao.getAllFamilies().stream()
        .map(family -> String.format("%s\n",family))
        .collect(Collectors.joining());
  }

  public List<Family> getFamiliesBiggerThan(int count) {
    return getAllFamilies().stream().filter(family -> family.countFamily() > count).collect(Collectors.toList());

  }

  public List<Family> getFamiliesLessThan(int count) {
    return getAllFamilies().stream().filter(family -> family.countFamily() < count).collect(Collectors.toList());

  }

  public List<Family> countFamiliesWithMemberNumber(int count) {
    return getAllFamilies().stream().filter(family -> family.countFamily() == count).collect(Collectors.toList());
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
    getAllFamilies().forEach(f -> {
      int year = LocalDate.now().getYear();
      f.getChildren().removeIf(c -> age < (year -
          Instant.ofEpochMilli(c.getYear()).atZone(ZoneId.systemDefault()).toLocalDate().getYear()));
      saveFamily(f);
    });
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
