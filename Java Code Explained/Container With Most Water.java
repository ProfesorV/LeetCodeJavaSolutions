//Ingredients: int[], five ints
class Solution {
    //int[]
  public int maxArea(int[] height) {
      //int set to
    int maximumArea = 0;
      //int set to
    int leftIdx = 0;
      //int set to 
    int rightIdx = height.length - 1;
      //while(int < int) while condition
    while (leftIdx < rightIdx) {
        //int = Math.min(int[int],int[int]) set to calculate
      int maxHeight = Math.min(height[leftIdx], height[rightIdx]);
        //int = int * (int - int) set to calculate
      int currArea = maxHeight * (rightIdx - leftIdx);
        //int = Math.max(int, int) set to calculate
      maximumArea = Math.max(currArea, maximumArea);
        //if (int == int[int]) if statement
      if (maxHeight == height[leftIdx]) {
          //int++ increment
        leftIdx++;
      } else {
          //int-- decrement
        rightIdx--; 
      }
    }
      //return int
    return maximumArea;
  }
}
