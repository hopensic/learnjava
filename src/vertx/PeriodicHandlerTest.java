package vertx;

import io.vertx.core.Vertx;


public class PeriodicHandlerTest {
  private static Vertx vertx = Vertx.vertx();


  public static void main(String[] args) {
    vertx.setPeriodic(100, id -> {
      System.out.println("timer fired");
    });

  }


}
