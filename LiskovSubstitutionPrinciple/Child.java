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

  /*@Override
  public void walk() {
    System.out.println("Child is too small to walk");
  }*/
  //in this case you should create a different class for walking and only parent will extend it and child will not
  
}