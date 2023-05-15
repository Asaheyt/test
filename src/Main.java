public class Main {
  public static void main(String[] args) {

    Test test = new Test();
    new Thread(test).start();
    Test.methodA(test.lock);

  }
}
