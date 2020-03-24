package hw07;

public final class Woman extends Human{
  @Override
  String greetPet() {
    return String.format("Hello, my %s. I am a woman\n", getFamily().getPet().getNickname());
  }

  String makeUp() {
    return String.format("I can make up\n");
  }
}
