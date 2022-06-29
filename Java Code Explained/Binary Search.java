class Solution {
  //int[], int
  public int search(int[] nums, int target) {
    //int
    int left = 0;
    //int
    int right = nums.length - 1;
    //while condition (int <= int)
    while (left <= right) {
      //set to (int + int)/2
      int mid = (left + right) / 2;
      //if condition int[int] == int
      if (nums[mid] == target) {
        //return
        return mid;
      }
      //else if condition (int[int]>int)
      else if (nums[mid] > target) {
        // set to int-1
        right = mid - 1;
      }
      else {
        //set to int + 1
        left = mid + 1;
      }
    }
    //return
    return -1;
  }
}
