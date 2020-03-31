package hw13.entity;

import java.util.ArrayList;

public final class Woman extends Human {
  public Woman(String name, String surname, String birthday) {
    super(name, surname, birthday);
  }

  @Override
  String greetPet(int petIndex) {
    return String.format("Hello, my %s. I am a woman\n", new ArrayList<>(getFamily().getPet()).get(petIndex).getNickname());
  }

  String makeUp() {
    return String.format("I can make up\n");
  }
}
