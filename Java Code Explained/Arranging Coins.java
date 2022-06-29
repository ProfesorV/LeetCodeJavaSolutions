class Solution {
  //int
  public int arrangeCoins(int n) {
    //long
    long left = 1;
    //long
    long right = n;
    //while condition (int <= int)
    while (left <= right) {
      //set to (long + long)/2
      long mid = (left + right) / 2;
      //set to = int * (int + 1)/2
      long sum = mid * (mid + 1) / 2;
      //if condition (long == long)
      if (sum == n) {
        //return (int)
        return (int) mid;
        //else if condition (long > int)
      } else if (sum > n) {
        //set to long -1
        right = mid - 1;
        //else
      } else {
        //set to long + 1
        left = mid + 1;
      }
    }
    //return (int)
    return (int) right;
  }
}
