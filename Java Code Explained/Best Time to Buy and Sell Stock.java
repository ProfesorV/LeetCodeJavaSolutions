class Solution {
  //int[]
  public int maxProfit(int[] prices) {
    //int
    int minPrice = prices[0];
    //int
    int maxProfit = 0;
    //for condition (int : int[])
    for (int price : prices) {
      //if (int < int[0])
      if (price < minPrice) {
        //set to
        minPrice = price;
      }
      //set to .max(int, int-int)
      maxProfit = Math.max(maxProfit, price - minPrice);
    }
    //return
    return maxProfit;
  }
}
