package hw13;

import hw13.controller.FamilyController;
import hw13.entity.*;

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
    Human mother = new Human("Lilly", "Gasumov", "12/02/1965");
    Human father = new Human("Leo", "Gasumov", "12/11/1961");
    Pet pet = new Dog("Jack", 2, 60, habitsPet);
    Set<Pet> pets = new HashSet<>();
    pets.add(pet);
    Human child1 = new Human("Alex", "Gasumov", "12/02/1993", 120, schedule);
    Human child2 = new Human("Nick", "Gasumov", "12/02/1995", 130, schedule);
    Human child3 = new Human("Dim", "Gasumov", "12/02/1985", 140, schedule);
    children.add(child1);
    children.add(child2);
    children.add(child3);
    Family family = new Family(mother, father, children, pets);

    System.out.println(child1.describeAge());

    familyController.saveFamily(family);

    System.out.println(familyController.getAllFamilies().toString());
    System.out.println(familyController.count());
    familyController.createNewFamily(new Human("ALI", "Guseynov", "12/02/2020"), new Human("Lilly", "Guseynova", "12/02/2020"));
    System.out.println(familyController.getAllFamilies().toString());
    System.out.println(familyController.count());
  }

}