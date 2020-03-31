package hw12.controller;

import hw12.entity.Family;
import hw12.entity.Human;
import hw12.entity.Pet;
import hw12.service.FamilyService;

import java.util.List;

public class FamilyController {
  FamilyService familyService = new FamilyService();

  public List<Family> getAllFamilies(){
    return familyService.getAllFamilies();
  }

  public void saveFamily(Family family){
    familyService.saveFamily(family);
  }

  public String displayAllFamilies(){
    return familyService.displayAllFamilies();
  }

  public List<Family> getFamiliesBiggerThan(int number){
    return familyService.getFamiliesBiggerThan(number);
  }

  public List<Family> getFamiliesLessThan(int number){
    return familyService.getFamiliesLessThan(number);
  }

  public List<Family> countFamiliesWithMemberNumber(int number){
    return familyService.countFamiliesWithMemberNumber(number);
  }

  public void createNewFamily(Human father, Human mother){
    familyService.createNewFamily(father, mother);
  }

  public void deleteFamilyByIndex(int index){
    familyService.deleteFamilyByIndex(index);
  }

  public Family bornChild(Family family, String girlName, String boyName){
    return familyService.bornChild(family, girlName, boyName);
  }

  public Family adoptChild(Family family, Human child){
    return familyService.adoptChild(family, child);
  }

  public void deleteAllChildrenOlderThen(int age){
    familyService.deleteAllChildrenOlderThen(age);
  }

  public int count(){
    return familyService.count();
  }

  public Family getFamilyById(int index){
    return familyService.getFamilyById(index);
  }

  public List<Pet> getPets(int index){
    return familyService.getPets(index);
  }

  public void addPet(int index, Pet pet){
    familyService.addPet(index, pet);
  }
}
