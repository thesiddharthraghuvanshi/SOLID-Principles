public class Child extends Parent {
  @Override
  public void walk() {
    System.out.println("Child walking");
  }

  public void run() {
    System.out.println("Child running");
  }

  //this princple says that child should always include the property of it's parent and add it's own
  //child should never exclude the parent property, in here it is walk()
}