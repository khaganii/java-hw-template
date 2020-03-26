package hw09.entity;

import java.util.Set;

public class Dog extends Pet {

  public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
    this.setSpecies(Species.Dog);
    this.setNickname(nickname);
    this.setAge(age);
    this.setTrickLevel(trickLevel);
    this.setHabits(habits);
  }

  @Override
  String respond() {
    return String.format("Hello, owner. I am - %s. I am a Cat!\n", getNickname());
  }

  @Override
  String foul() {
    return super.foul();
  }
}
