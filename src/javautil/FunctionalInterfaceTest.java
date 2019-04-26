package javautil;

public class FunctionalInterfaceTest {


  @FunctionalInterface
  interface GreetingService {
    void sayMessage(String message);
  }


  public static void main(String[] args) {
    GreetingService s = message -> System.out.println("hello," + message);
    s.sayMessage("oliver");
  }


}
