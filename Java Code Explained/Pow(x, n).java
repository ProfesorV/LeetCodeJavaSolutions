//Ingredients: double, int
class Solution {
    //double, int
  public double myPow(double x, int n) {
      //if(int == 0) if condition
    if (n == 0) {
      return 1;
    }
      //if(int < 0) if condition
    if (n < 0) {
        //return 1/double * function(1/x,-1*(n+1))
      return 1 / x * myPow(1 / x, -1 * (n + 1));
    }
      //int % 2 == 0? function(double * double, int/2): double * function(double * double, int/2)
    return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
  }
}
