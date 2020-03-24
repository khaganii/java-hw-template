package hw06;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

  private Family testFamily;

  @BeforeEach
  void setUp() {
    Human[] children = new Human[5];
    Human mother = new Human("Elvin", "Elvin", 1984);
    Human father = new Human("Emin", "Emin", 1982);
    this.testFamily = new Family(mother, father, children);
  }

  @org.junit.jupiter.api.Test
  void addChild() {
    Human child1 = new Human("Nick", "Elvin", 1991);

    int expected = 1;
    int actual = testFamily.addChild(child1);
    assertEquals(expected, actual);
  }

  @org.junit.jupiter.api.Test
  void deleteChild() {
    Human child1 = new Human("Eli", "Adam", 1991);

    testFamily.addChild(child1);
    boolean expected = true;
    boolean actual = testFamily.deleteChild(0);
    assertEquals(expected, actual);
  }


  @org.junit.jupiter.api.Test
  void testDeleteChild() {
    Human child1 = new Human("Eli", "Adam", 1991);

    testFamily.addChild(child1);
    boolean expected = true;
    boolean actual = testFamily.deleteChild(child1);
    assertEquals(expected, actual);
  }

  @org.junit.jupiter.api.Test
  void countFamily() {
    Human child1 = new Human("Elton", "Alik", 1991);
    testFamily.addChild(child1);
    testFamily.deleteChild(0);
    int expected = 2;
    int actual = testFamily.countFamily();
    assertEquals(expected, actual);
  }
}