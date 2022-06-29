class Solution {
  //int
  public boolean hasAlternatingBits(int n) {
    //Integer
    Integer prev = null;
    //while condition (int >0)
    while (n > 0) {
      //set to int % 2
      int rem = n % 2;
      //int /=2
      n /= 2;
      //if (int == null || != int)
      if (prev == null || prev != rem) {
        //set to
        prev = rem;
      } else {
        //return
        return false;
      }
    }
    //return
    return true;
  }
}
