import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test implements Runnable {
  static Lock lock = new ReentrantLock();


  @Override
  public void run() {
    Test test = new Test();
    test.methodB(lock);
  }

  public static void methodA(Lock lock) {

    lock.lock();
    System.out.println("TestClass before sleep || " + Thread.currentThread().getName());
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("TestClass after sleep || " + Thread.currentThread().getName());
    lock.unlock();

  }

  public void methodB(Lock lock) {

    lock.lock();
    System.out.println("TestClass before sleep || None static || " + Thread.currentThread().getName());
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("TestClass after sleep || None static || " + Thread.currentThread().getName());
    lock.unlock();
  }

}
