package hw07;

public final class Man extends Human {
  @Override
  String greetPet() {
    return String.format("Hello, my %s. I am a man\n", getFamily().getPet().getNickname());
  }
  String repair() {
    return String.format("I can repair my car\n");
  }
}
