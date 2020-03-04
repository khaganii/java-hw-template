package hw05;


public class Family {
  Human mother;
  Human father;
  Human [] children;
  Family(Human mother, Human father, Human[] children)
  {
    this.mother = mother;
    this.father = father;
    this.children = children;
  }
  public Human[] addChild(Human [] children, Human child){
    int n = children.length;
    Human [] arr = new Human[n+1];
    for (int i = 0; i < n; i++) {
      arr[i] = children[i];
    }
    arr[n] = child;
    return arr;
  }

  public Human[] removeChild(Human [] children, Human child){
    int n = children.length;
    int k = 0;
    Human [] arr = new Human[n-1];
      for (int i = 0; i < n; i++) {
        if(!(children[i].equals(child)))
        {
          arr[k] = children[i];
          k++;
        }
      }
      System.out.println("Child was deleted!");
    return arr;
  }

  public int countFamily(Human [] children){
    return (children.length + 2);
  }

}
