//Ingredients: Int[], 3 ints
class Solution {
  //int[]
  public void nextPermutation(int[] nums) {
    //if(int[].length<=1) if condition
    if (nums.length <= 1) {
      //return
      return;
    }
    //int = int[].length - 2 set to calculate
    int idx = nums.length - 2;
    //while(int >=0 && int[int] >= int[int+1]) while condition
    while (idx >= 0 && nums[idx] >= nums[idx + 1]) {
      //int-- decrement
      idx--;
    }
    //if(int>=0) if condition
    if (idx >= 0) {
      //int = int[].length - 1 set to calculate
      int endIdx = nums.length - 1;
      //while(int[int] <= int[int]) while condition
      while (nums[endIdx] <= nums[idx]) {
        //int-- decrement
        endIdx--;
      }
      //swap(int[], int, int) apply function
      swap(nums, idx, endIdx);
    }
    //int = int +1 set to calculate
    int startIdx = idx + 1;
    //int = int[].length - 1 set to calculate
    int endIdx = nums.length - 1;
    //while (int < int) while condition
    while (startIdx < endIdx) {
      //swap(int[], int++, swap--) apply function
      swap(nums, startIdx++, endIdx--);
    }
  }
  //int[], int, int
  private void swap(int[] nums, int idxOne, int idxTwo) {
    //int = int[int] set to
    int temp = nums[idxOne];
    //int[int] = int[int] set to
    nums[idxOne] = nums[idxTwo];
    //int [int] = int set to
    nums[idxTwo] = temp;
  }
}
