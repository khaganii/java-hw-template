package hw07;

public class Main {

  public static void main(String[] args) {
    String[] habitsPet = new String[] {"eat", "sleep", "play"};
    String[][] schedule = new String[7][2];
    schedule[0][0] = Daysofweek.Monday.name();
    schedule[0][1] = "Speaking";
    schedule[1][0] = Daysofweek.Tuesday.name();
    schedule[1][1] = "Listening";
    schedule[2][0] = Daysofweek.Wednesday.name();
    schedule[2][1] = "Reading";
    schedule[3][0] = Daysofweek.Thursday.name();
    schedule[3][1] = "Writing";
    schedule[4][0] = Daysofweek.Friday.name();
    schedule[4][1] = "Sleeping";
    schedule[5][0] = Daysofweek.Saturday.name();
    schedule[5][1] = "Relaxing";
    schedule[6][0] = Daysofweek.Sunday.name();
    schedule[6][1] = "Coding";

    Human[] children = new Human[5];
    Human mother = new Human("Lilly", "Gasumov", 1970);
    Human father = new Human("Leo", "Gasumov", 1961);
    Pet pet = new Dog("Jack", 2, 60, habitsPet);
    Human child1 = new Human("Alex", "Gasumov", 1991, 120, schedule);
    Human child2 = new Human("Nick", "Gasumov", 1993, 130, schedule);
    Human child3 = new Human("Dim", "Gasumov", 1995, 140, schedule);
    Family family = new Family(mother, father, children, pet);

    family.addChild(child1);
    family.addChild(child1);
    System.out.println("Family Count: " + family.countFamily());
    family.addChild(child3);
    System.out.println("Family Count: " + family.countFamily());
    family.deleteChild(child3);
    System.out.println("Family Count: " + family.countFamily());
    System.out.println(family.toString());

//    for (int i = 0; i <= 100000000 ; i++) {
//       new Human();
//    }

  }

}