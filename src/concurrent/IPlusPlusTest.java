package concurrent;


public class IPlusPlusTest {

  public static void main(String[] args) throws InterruptedException {
    Num num = new Num();
    ThreadA threadA = new ThreadA(num);
    ThreadB threadB = new ThreadB(num);
    threadA.start();
    threadB.start();
    Thread.sleep(200);
    System.out.println(num.count);
  }
}

class ThreadA extends Thread {
  private Num num;

  public ThreadA(Num num) {
    this.num = num;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      num.count++;
    }
  }
}

class ThreadB extends Thread {
  private Num num;

  public ThreadB(Num num) {
    this.num = num;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      num.count++;
    }
  }
}

class Num {
  int count = 0;

  public Num() {
  }
}