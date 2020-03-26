package hw09.controller;

import hw09.entity.Family;
import hw09.entity.Human;
import hw09.entity.Pet;
import hw09.service.FamilyService;

import java.util.*;

public class FamilyController {
  FamilyService familyService = new FamilyService();

  public List<Family> getAllFamilies(){
    return familyService.getAllFamilies();
  }

  public void saveFamily(Family family){
    familyService.saveFamily(family);
  }

  public void displayAllFamilies(){
    familyService.displayAllFamilies();
  }

  public void getFamiliesBiggerThan(int number){
    familyService.getFamiliesBiggerThan(number);
  }

  public void getFamiliesLessThan(int number){
    familyService.getFamiliesLessThan(number);
  }

  public void countFamiliesWithMemberNumber(int number){
    familyService.countFamiliesWithMemberNumber(number);
  }

  public void createNewFamily(Human father, Human mother){
    familyService.createNewFamily(father, mother);
  }

  public void deleteFamilyByIndex(int index){
    familyService.deleteFamilyByIndex(index);
  }

  public String bornChild(Family family, String girlName, String boyName){
    return familyService.bornChild(family, girlName, boyName);
  }

  public String adoptChild(Family family, Human child){
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
