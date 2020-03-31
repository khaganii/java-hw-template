package hw13.entity;

import java.util.Set;

public class RobotCat extends Pet {

  public RobotCat(String nickname, int age, int trickLevel, Set<String> habits) {
    this.setSpecies(Species.RobotCat);
    this.setNickname(nickname);
    this.setAge(age);
    this.setTrickLevel(trickLevel);
    this.setHabits(habits);
  }

  @Override
  String respond() {
    return String.format("Hello, owner. I am - %s. I am a RobotCat!\n", getNickname());
  }

}
