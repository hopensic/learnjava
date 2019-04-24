package javautil;

import java.util.function.Function;

public class LearnFuntion {
  static void modifyTheValue(int valueToBeOperated, Function<Integer, Integer> function) {
    int newValue = function.apply(valueToBeOperated);
    System.out.println("new vaule:" + newValue);
  }

  public static void main(String[] args) {
    int incr = 20;
    int myNumber = 10;
    modifyTheValue(myNumber, val -> val + incr);
    myNumber = 15;
    modifyTheValue(myNumber, val -> val * 10);
  }


}
