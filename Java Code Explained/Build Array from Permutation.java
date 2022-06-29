class Solution {
  //int[]
  public int[] buildArray(int[] nums) {
    //set to create new int[int.Length]
    int[] ans = new int[nums.length];
    //for condition (int.length)
    for (int i = 0; i < nums.length; i++) {
      //int[int]=int[int[int]]
      ans[i] = nums[nums[i]];
    }
    //return int[]
    return ans;
  }
}
