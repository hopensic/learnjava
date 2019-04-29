package vertx;

import io.vertx.core.Future;

public class ExecuteBlockingTest {

  public void executeLongRunningBlockingOperation() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }


  public Future<Void> doTheJob() {
    System.out.println("Doing the job...");
    Future<Void> future = Future.future();
    executeLongRunningBlockingOperation();
    future.complete();
    return future;
  }


  public static void main(String[] args) {
    new ExecuteBlockingTest().doTheJob().setHandler(result -> {
      System.out.println("Finished the job");
    });

    System.out.println("Doing other stuff in the mean time...");

  }


}
