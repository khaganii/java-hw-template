package hw13.entity;

import java.util.ArrayList;

public final class Man extends Human {
  public Man(String name, String surname, String birthday) {
    super(name, surname, birthday);
  }

  @Override
  String greetPet(int petIndex) {
    return String.format("Hello, my %s. I am a man\n", new ArrayList<>(getFamily().getPet()).get(petIndex).getNickname());
  }
  String repair() {
    return String.format("I can repair my car\n");
  }
}
