package hw04;

public class Main_hw_4 {
    public static void main(String[] args) {
      Pet f1_pet = new Pet("bol_dog", "mickey");
      Human mother = new Human("Freddy", "Karl", 50);
      Human father = new Human("Anna", "Karl", 45);
      Human f1_child = new Human("Daniel", "Karl", 140, f1_pet, 20, father, mother, new String [][] {{"monday" , "saturday"},{"reading", "speaking"}});

      System.out.println("name: " + f1_child.name + " | surname: " + f1_child.surname + " | father: " + father.name + " | mother: " +
          mother.name + " | age: " + f1_child.year + " | IQ: " + f1_child.iq + " | Pet: " + f1_pet.species + " '" +
          f1_pet.nickname + "' " + f1_child.schedule[0][0] + " , " + f1_child.schedule[1][0] + " doing " + f1_child.schedule[0][1] + " and " + f1_child.schedule[1][1]);

    }
}


