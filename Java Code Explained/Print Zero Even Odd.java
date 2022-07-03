class ZeroEvenOdd {
  //int
  private int n;
  //int set to
  private int flag = 0;
//int
  public ZeroEvenOdd(int n) {
    this.n = n;
  }

  public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
    //for condition (int < int)
    for (int i = 0; i < n; i++) {
      //while condition (int != 0)
      while (flag != 0) {
        this.wait();
      }
      printNumber.accept(0);
      //calculate int
      flag = i % 2 == 0 ? 1 : 2;
      this.notifyAll();
    }
  }

  public synchronized void even(IntConsumer printNumber) throws InterruptedException {
    //for condition (int <= int)
    for (int i = 2; i <= n; i += 2) {
      //while condition (int != 2)
      while (flag != 2) {
        this.wait();
      }
      printNumber.accept(i);
      //set to
      flag = 0;
      this.notifyAll();
    }
  }

  public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
    //for condition (int <= int)
    for (int i = 1; i <= n; i += 2) {
      //while condition (int != 1)
      while (flag != 1) {
        this.wait();
      }
      printNumber.accept(i);
      //set to
      flag = 0;
      this.notifyAll();
    }
  }
}
