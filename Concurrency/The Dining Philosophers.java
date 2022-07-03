class DiningPhilosophers {
  
  //List<Semaphore>
  private List<Semaphore> forks;
  //Semaphore
  private Semaphore dinersOnTable;
  //List<String>
  private List<String> state;
  
  public DiningPhilosophers() {
    //set to create new ArrrayList<>
    this.forks = new ArrayList<>();
    this.state = new ArrayList<>();
    //for condition (int < int)
    for (int i = 0; i < 5; i++) {
      this.forks.add(new Semaphore(1));
      this.state.add("idle");
    }
    this.dinersOnTable = new Semaphore(4);
  }

  public void wantsToEat(int philosopher,
                         Runnable pickLeftFork,
                         Runnable pickRightFork,
                         Runnable eat,
                         Runnable putLeftFork,
                         Runnable putRightFork) throws InterruptedException {
    int leftForkIdx = philosopher;
    int rightForkIdx = (philosopher + 4) % 5;
    
    this.dinersOnTable.acquire();
    if (this.state.get(philosopher).equals("eating")) {
      this.dinersOnTable.release();
      return;
    }
    this.state.set(philosopher, "eating");
    pickFork(leftForkIdx, pickLeftFork);
    pickFork(rightForkIdx, pickRightFork);
    eat.run();
    putFork(rightForkIdx, putRightFork);
    putFork(leftForkIdx, putLeftFork);
    this.state.set(philosopher, "idle");
    this.dinersOnTable.release();
  }
  
  private void putFork(int idx, Runnable put) {
    put.run();
    this.forks.get(idx).release();
  }
  
  private void pickFork(int idx, Runnable pick) throws InterruptedException  {
    this.forks.get(idx).acquire();
    pick.run();
  }
}
