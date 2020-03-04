package hw05;

public class Pet {
  private String species;
  private String nickname;
  private int age;
  private int trick_level;
  private String[] habits = new  String[5];

  Pet(String a, String b, int c, int d, String [] h){
    species = a;
    nickname = b;
    age = c;
    trick_level = d;
    habits = h.clone();
  }
  Pet(String a, String b){
    species = a;
    nickname = b;
  }
  Pet()
  {

  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getTrick_level() {
    return trick_level;
  }

  public void setTrick_level(int trick_level) {
    this.trick_level = trick_level;
  }

  public String[] getHabits() {
    return habits;
  }

  public void setHabits(String[] habits) {
    this.habits = habits;
  }
}
