package hw09;

import hw09.controller.FamilyController;
import hw09.entity.*;

import java.util.*;

public class Main {


  public static void main(String[] args) {
    FamilyController familyController = new FamilyController();
    HashSet<String> habitsPet = new HashSet<>(Arrays.asList("eat", "sleep", "play"));
    HashMap<String, String> schedule = new HashMap<>();
    schedule.put(Doaysofweek.Monday.name(),
        "Speaking");
    schedule.put(Doaysofweek.Tuesday.name(),
        "Listening");
    schedule.put(Doaysofweek.Wednesday.name(),
        "Reading");
    schedule.put(Doaysofweek.Thursday.name(),
        "Writing");
    schedule.put(Doaysofweek.Friday.name(),
        "Sleeping");
    schedule.put(Doaysofweek.Saturday.name(),
        "Relaxing");
    schedule.put(Doaysofweek.Sunday.name(),
        "Coding");

    List<Human> children = new ArrayList<>();
    Human mother = new Human("Lilly", "Gasumov", 1970);
    Human father = new Human("Leo", "Gasumov", 1961);
    Pet pet = new Dog("Jack", 2, 60, habitsPet);
    Set<Pet> pets = new HashSet<>();
    pets.add(pet);
    Human child1 = new Human("Alex", "Gasumov", 1991, 120, schedule);
    Human child2 = new Human("Nick", "Gasumov", 1993, 130, schedule);
    Human child3 = new Human("Dim", "Gasumov", 1995, 140, schedule);
    Family family = new Family(mother, father, children, pets);

    familyController.saveFamily(family);

    familyController.displayAllFamilies();
    System.out.println(familyController.count());
    familyController.createNewFamily(new Human("ALI", "Guseynov", 45), new Human("Lilly", "Guseynova", 40));
    System.out.println(familyController.getAllFamilies().toString());
    System.out.println(familyController.count());





  }

}