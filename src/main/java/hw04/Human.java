package hw04;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet = new Pet();
    String [][] schedule = new String[7][2];
    Object mother;
    Object father;
    Human(){

    }
    Human(String name, String surname, int year, Human mother ,Human father){
      this.name = name;
      this.surname = surname;
      this.year = year;
      this.mother = mother;
      this.father = father;
    }
    Human(String name, String surname, int year){
      this.name = name;
      this.surname = surname;
      this.year = year;
    }
    Human(String name, String surname, int iq, Pet pet, int year, Human mother , Human father, String[][] schedule){
      this.name = name;
      this.surname = surname;
      this.year = year;
      this.mother = mother;
      this.father = father;
      this.schedule = schedule;
    }
    public void greetPet(){
      System.out.printf("Hello, %s \n", pet.toString());
    }
    public void describePet(){
        String trlvl;
        if(pet.trick_level > 50) trlvl = "very sly";
        else trlvl = "almost not sly";
        System.out.printf("I have a, %s he is %d years old. he is %s. \n", pet.species, pet.age, trlvl);
    }

}
