package concurrent;

import java.util.concurrent.CountDownLatch;

public class VolatileTest {


  public static void main(String[] args) {
    new VolatileTest().test();
  }


  public void test() {
    CountDownLatch countDownLatch = new CountDownLatch(5);
    for (int i = 0; i < 5; i++) {
      new Thread(new VolatileThread(countDownLatch,1)).start();
    }


  }


  static class VolatileThread implements Runnable {
    private  int i;
    CountDownLatch countDownLatch;

    public VolatileThread(CountDownLatch countDownLatch, int i) {
      this.countDownLatch = countDownLatch;
      this.i = i;

    }

    @Override
    public void run() {
//      try {
//        Thread.sleep(10);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//
//      }

      try {
        System.out.println(++i);
        countDownLatch.countDown();
        countDownLatch.await();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      //i = i +1;
      System.out.println(++i);
    }
  }


}
