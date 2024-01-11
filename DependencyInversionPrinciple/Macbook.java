public class Macbook{

  /*
  private final WiredKeyboard wiredKeyboard;

  Macbook(WiredKeyboard wiredKeyboard){
    this.wiredKeyboard = wiredKeyboard;
  }*/
  //but now in this if we want to change bluetooth keyboard than this will break

  //so we can use interface
  private final KeyboardInterface keyboard;

  Macbook(KeyboardInterface keyboard){
    this.keyboard = keyboard;
  }
}