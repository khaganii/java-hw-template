package hw07;

public class DomesticCat extends Pet {
  public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
    this.setSpecies(Species.DomesticCat);
    this.setNickname(nickname);
    this.setAge(age);
    this.setTrickLevel(trickLevel);
    this.setHabits(habits);
  }
  @Override
  String respond() {
    return String.format("Hello, owner. I am - %s. I am a DomesticCat!\n", getNickname());
  }

  @Override
  String foul() {
    return super.foul();
  }
}
