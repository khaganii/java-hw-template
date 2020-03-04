package hw05;

public class Main {
  public static void main(String[] args) {
    Human human = new Human();
    Human f1_mother = new Human("Anna", "Kane", 45);
    Human f1_father = new Human("Jake", "Kane", 50);
    Human[] children = new Human[]{new Human("Jim", "Kane", 22), new Human("Harry", "Kane", 26)};
    Family family_1 = new Family(f1_father, f1_mother, children);
    showFamily(family_1);
    System.out.printf("Count of Family: %d \n", family_1.countFamily(family_1.children));
    family_1.children = family_1.addChild(family_1.children, new Human("John", "Kane", 17));
    showFamily(family_1);
    System.out.printf("Count of Family: %d \n", family_1.countFamily(family_1.children));
    family_1.children = family_1.removeChild(family_1.children, family_1.children[1]);
    showFamily(family_1);
    System.out.printf("Count of Family: %d \n", family_1.countFamily(family_1.children));
  }
  public static void showFamily(Family family)
  {
    System.out.printf("Mother: %s %s , Father: %s %s ", family.mother.getName(), family.mother.getSurname(), family.father.getName(), family.father.getSurname());
    for (Human child: family.children) {
      if(child != null)
        System.out.printf(", Child: %s ", child.getName());
    }
    System.out.printf("\n");
  }
}
