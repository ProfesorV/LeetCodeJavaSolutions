class Solution {
  //inr[]
  public boolean canCross(int[] stones) {
    //int[][]
    int[][] memo = new int[stones.length][stones.length];
    //for condition (int[] : int[][])
    for (int[] row : memo) {
      //.fill (int[],1)
      Arrays.fill(row, -1);
    }
    return jumpCounter(stones, 0, 0, memo) == 1;
  }
  //int[], int, int, int[][]
  private int jumpCounter(int[] stones, int idx, int jumpSize, int[][] memo) {
    //if condition (int[int][int] >= 0)
    if (memo[idx][jumpSize] >= 0) {
      //return int[int][int]
      return memo[idx][jumpSize];
    }
    //for condition (int < int)
    for (int i = idx + 1; i < stones.length; i++) {
      //int = int[int]-int[int]
      int gap = stones[i] - stones[idx];
      //if condition (int >= int -1 && int <= int + 1)
      if (gap >= jumpSize - 1 && gap <= jumpSize + 1) {
        //if condition (function(int[], int, int, int[][]) == 1)
        if (jumpCounter(stones, i, gap, memo) == 1) {
          //int[int][int] = 1
          memo[idx][gap] = 1;
          //return 1
          return 1;
        }
      }
    }
    //int[int][int] = (int == int[].length - 1) ? 1 : 0
    memo[idx][jumpSize] = (idx == stones.length - 1) ? 1 : 0;
    //return int[int][int]
    return memo[idx][jumpSize];
  }
}