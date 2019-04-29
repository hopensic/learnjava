package vertx;

import io.vertx.core.Future;
import io.vertx.core.Vertx;

public class ExecuteBlockingTest2 {

  public void executeLongRunningBlockingOperation() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }


  public Future<Void> doTheJob() {
    System.out.println("Doing the job...");
    Future<Void> future = Future.future();
    Vertx vertx = Vertx.vertx();
    vertx.executeBlocking(call -> {
      executeLongRunningBlockingOperation();
      call.complete();

    }, result -> {

      future.fail("123");});
    return future;
  }


  public static void main(String[] args) {
    new ExecuteBlockingTest2().doTheJob().setHandler(result -> {
      if(result.succeeded()){
        System.out.println("job finished successfully");
      }else if(result.failed()){
        System.out.println("job finished fail");
        System.out.println("reason :"+result.cause());
      }


    });

    System.out.println("Doing other stuff in the mean time...");

  }


}
