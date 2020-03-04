package hw05;

public class Human {
  private String name;
  private String surname;
  private int year;
  private int iq;
  private Pet pet;
  private String [][] schedule = new String[7][2];
  private Object mother;
  private Object father;

  Human(){

  }
  Human(String name, String surname, int year, hw04.Human mother , hw04.Human father){
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
  Human(String name, String surname, int iq, hw04.Pet pet, int year, hw04.Human mother , hw04.Human father, String[][] schedule){
    this.name = name;
    this.surname = surname;
    this.year = year;
    this.mother = mother;
    this.father = father;
    this.schedule = schedule;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getIq() {
    return iq;
  }

  public void setIq(int iq) {
    this.iq = iq;
  }

  public Pet getPet() {
    return pet;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }

  public String[][] getSchedule() {
    return schedule;
  }

  public void setSchedule(String[][] schedule) {
    this.schedule = schedule;
  }

  public Object getMother() {
    return mother;
  }

  public void setMother(Human mother) {
    this.mother = mother;
  }

  public Object getFather() {
    return father;
  }

  public void setFather(Human father) {
    this.father = father;
  }
}
