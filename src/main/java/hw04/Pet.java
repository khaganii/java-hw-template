package hw04;

public class Pet {
    String species;
    String nickname;
    int age;
    int trick_level;
    String habits [] = new  String[5];

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
    public void eat(){
        System.out.print("I am eating! \n");
    }
    public void respond(){
        System.out.printf("Hello, owner. I am - %s. I miss you! \n", nickname);
    }
    public  void foul(){
        System.out.print("I need to cover it up \n");
    }
}
