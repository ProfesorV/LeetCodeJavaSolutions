import java.util.concurrent.atomic.AtomicInteger;

class Foo {

  private Object lock;
  private AtomicInteger counter;

  public Foo() {
    this.lock = new Object();
    this.counter = new AtomicInteger(0);
  }

  public void first(Runnable printFirst) throws InterruptedException {
    synchronized (lock) {
      printFirst.run();
      this.counter.incrementAndGet();
      this.lock.notifyAll();
    }
  }

  public void second(Runnable printSecond) throws InterruptedException {
    synchronized (lock) {
      while (this.counter.get() != 1) {
        this.lock.wait();
      }
      printSecond.run();
      this.counter.incrementAndGet();
      this.lock.notifyAll();
    }
  }

  public void third(Runnable printThird) throws InterruptedException {
    synchronized (lock) {
      while (this.counter.get() != 2) {
        this.lock.wait();
      }
      printThird.run();
    }
  }
}
