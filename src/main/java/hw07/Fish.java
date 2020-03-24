package hw07;

public class Fish extends Pet {

  public Fish(String nickname, int age, int trickLevel, String[] habits) {
    this.setSpecies(Species.Fish);
    this.setNickname(nickname);
    this.setAge(age);
    this.setTrickLevel(trickLevel);
    this.setHabits(habits);
  }

  @Override
  String respond() {
    return String.format("Hello, owner. I am - %s. I am a fish!\n", getNickname());
  }

  @Override
  String foul() {
    return super.foul();
  }

}
