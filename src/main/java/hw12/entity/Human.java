package hw12.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Random;

public class Human {

  private String name;
  private String surname;
  private Family family;
  private long birthday;
  private int iq;
  private Map<String, String> schedule;

  public Human() {

  }

  public Human(String name, String surname, String birthDate) {
    this.name = name;
    this.surname = surname;

    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    try {
      Date date = format.parse(birthDate);
      this.birthday = date.getTime();
    } catch (Exception e) {
      System.out.println("Wrong date input!");
    }

  }

  public Human(String name, String surname, String birthDate, Family family) {
    this.name = name;
    this.surname = surname;
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    try {
      Date date = format.parse(birthDate);
      this.birthday = date.getTime();
    } catch (Exception e) {
      System.out.println("Wrong date input!");
    }
    this.family = family;
  }

  public Human(String name, String surname, String birthDate, int iq, Map<String, String> schedule) {
    this.name = name;
    this.surname = surname;
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    try {
      Date date = format.parse(birthDate);
      this.birthday = date.getTime();
    } catch (Exception e) {
      System.out.println("Wrong date input!");
    }
    this.iq = iq;
    this.schedule = schedule;
  }

  public Human(String name, String surname, String birthDate, int iq, Family family, Map<String, String> schedule) {
    this.name = name;
    this.surname = surname;
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    try {
      Date date = format.parse(birthDate);
      this.birthday = date.getTime();
    } catch (Exception e) {
      System.out.println("Wrong date input!");
    }
    this.iq = iq;
    this.family = family;
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

  public long getYear() {
    return birthday;
  }

  public void setYear(long birthday) {
    this.birthday = birthday;
  }

  public int getIq() {
    return iq;
  }

  public void setIq(int iq) {
    this.iq = iq;
  }

  public Family getFamily() {
    return family;
  }

  public void setFamily(Family family) {
    this.family = family;
  }

  public Map<String, String> getSchedule() {
    return schedule;
  }

  public void setSchedule(Map<String, String> schedule) {
    this.schedule = schedule;
  }


  String greetPet(int petIndex) {
    return String.format("Hello, %s.\n", new ArrayList<>(family.getPet()).get(petIndex).getNickname());
  }

  String describePet(int petIndex) {
    String trick = new ArrayList<>(family.getPet()).get(petIndex).getTrickLevel()>=50 ? "very sly.\n" : "almost not sly.\n";
    return String.format("I have a %s, he is %d years old, he is %s", new ArrayList<>(family.getPet()).get(petIndex).getSpecies(), new ArrayList<>(family.getPet()).get(petIndex).getAge(), new ArrayList<>(family.getPet()).get(petIndex).getTrickLevel());
  }

  boolean feedPet(boolean hungry, int petIndex) {
    String hunger;
    if(hungry) {
      hunger = String.format("Hm... I will feed %s's %s.", name, new ArrayList<>(family.getPet()).get(petIndex).getNickname());
      System.out.println(hunger);
      return true;
    }
    else {
      Random random = new Random();
      int hungerRandom = random.nextInt(100);
      if(new ArrayList<>(family.getPet()).get(petIndex).getTrickLevel()>hungerRandom){
        hunger = String.format("Hm... I will feed %s's %s.", name, new ArrayList<>(family.getPet()).get(petIndex).getNickname());
        System.out.println(hunger);
        return true;
      }
      else {
        hunger = String.format("I think %s's %s is not hungry.", name, new ArrayList<>(family.getPet()).get(petIndex).getNickname());
        System.out.println(hunger);
        return false;
      }
    }
  }

  public String describeAge(){
    LocalDate today = LocalDate.now();
    Date birthday1 = new Date(birthday);
    LocalDate localBD = birthday1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    Period p = Period.between(localBD, today);
    return String.format("%s years %s months %s days", p.getYears(), p.getMonths(), p.getDays());
  }

  @Override
  public String toString() {
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String dateFormatted = formatter.format(birthday);
    return "Human{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", birthday=" + dateFormatted + ", iq=" + iq + ", schedule=" + schedule.toString() + '}';
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println("Objects was deleted!");
  }

}