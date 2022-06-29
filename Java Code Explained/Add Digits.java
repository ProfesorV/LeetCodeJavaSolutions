class Solution {
  //int
  public int addDigits(int num) {
    //if condition (int/10 ==)
    if (num / 10 == 0) {
      //return
      return num;
    }
    //set to
    int digitSum = 0;
    //while condition (int >)
    while (num > 0) {
      //int augment by int %
      digitSum += num % 10;
      //int calculate
      num /= 10;
    }
    //return function recursive
    return addDigits(digitSum);
  }
}
