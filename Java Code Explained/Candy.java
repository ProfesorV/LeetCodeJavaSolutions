class Solution {
  //int[
  public int candy(int[] ratings) {
    //set to create new int[int.length]
    int[] leftCandy = new int[ratings.length];
    int[] rightCandy = new int[ratings.length];
    //.fill(int[],1)
    Arrays.fill(leftCandy, 1);
    Arrays.fill(rightCandy, 1);
    //for condition (int < int[].Length)
    for (int i = 1; i < ratings.length; i++) {
      //if condition (int[int] > int[int-1])
      if (ratings[i] > ratings[i - 1]) {
        //int[int] = int[int-1]+1
        leftCandy[i] = leftCandy[i - 1] + 1;
      }
    }
    //for condition (int[].length -2)
    for (int i = ratings.length - 2; i >= 0; i--) {
      //if condition (int[int] > int[int + 1])
      if (ratings[i] > ratings[i + 1]) {
        //set to int[int + 1]+1
        rightCandy[i] = rightCandy[i + 1] + 1;
      }
    }
    //int
    int numOfCandies = 0;
    //for condition (int < int[].length)
    for (int i = 0; i < ratings.length; i++) {
      //augment by .max(int[int],int[int])
      numOfCandies += Math.max(leftCandy[i], rightCandy[i]);
    }
    //return
    return numOfCandies; 
  }
}
