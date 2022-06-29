class Solution {
  //int[]
  public int arrayPairSum(int[] nums) {
    //int[]
    int[] counter = new int[20001];
    //for condition (int : int[])
    for (int num : nums) {
      //int[int + 10000] increment
      counter[num + 10000]++;
    }
    //int
    int sum = 0;
    //boolean
    boolean pickFirst = true;
    //for condition (int < int[].Length)
    for (int i = 0; i < counter.length; i++) {
      //while condition (int[int] >)
      while (counter[i] > 0) {
        //if (boolean)
        if (pickFirst) {
          //augment by int - 10000
          sum += i - 10000;
        }
        //set to !
        pickFirst = !pickFirst;
        //int[int]--
        counter[i]--;
      }
    }
    //return
    return sum;
  }
}
