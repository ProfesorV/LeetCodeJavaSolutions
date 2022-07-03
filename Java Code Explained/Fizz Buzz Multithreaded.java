class FizzBuzz {
  //int
  private int n;
  private int count;
  //Semaphore
  private Semaphore fizz;
  private Semaphore buzz;
  private Semaphore fizzBuzz;
  private Semaphore number;
//int
  public FizzBuzz(int n) {
    this.n = n;
    this.count = 1;
    this.fizz = new Semaphore(0);
    this.buzz = new Semaphore(0);
    this.fizzBuzz = new Semaphore(0);
    this.number = new Semaphore(1);
  }

  public void fizz(Runnable printFizz) throws InterruptedException {
    //while condition (int <= int)
    while (this.count <= this.n) {
      //if condition (int % 3 == 0 && int % 5 != 0)
      if (this.count % 3 == 0 && this.count % 5 != 0) {
        this.fizz.acquire();
        printFizz.run();
        //int++
        this.count++;
        releaseLock(this.count);
      }
    }
  }

  public void buzz(Runnable printBuzz) throws InterruptedException {
    //while condition (int <= int)
    while (this.count <= this.n) {
      //if condition (int % 3!= 0 && int % 5 == 0)
      if (this.count % 3 != 0 && this.count % 5 == 0) {
        this.buzz.acquire();
        printBuzz.run();
        //int ++
        this.count++;
        releaseLock(this.count);
      }
    }
  }

  public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
    //while condition (int <= int)
    while (this.count <= this.n) {
      //if condition (int % 3 == 0 && int % 5 == 0)
      if (this.count % 3 == 0 && this.count % 5 == 0) {
        this.fizzBuzz.acquire();
        printFizzBuzz.run();
        //int ++
        this.count++;
        releaseLock(this.count);
      }
    }
  }

  public void number(IntConsumer printNumber) throws InterruptedException {
    //while condition (int <= int)
    while (this.count <= this.n) {
      //if condition (int % 3 != 0 && int % 5 != 0)
      if (this.count % 3 != 0 && this.count % 5 != 0) {
        this.number.acquire();
        printNumber.accept(this.count);
        //int ++
        this.count++;
        releaseLock(this.count);
      }
    }
  }
  //int
  private void releaseLock(int n) {
    //if condition (int % 15 == 0)
    if (n % 15 == 0) {
      this.fizzBuzz.release();
      //else if condition (int % 3 == 0)
    } else if (n % 3 == 0) {
      this.fizz.release();
      //else if condition (int % 5 == 0)
    } else if (n % 5 == 0) {
      this.buzz.release();
    } else {
      this.number.release();
    }
  }
}
