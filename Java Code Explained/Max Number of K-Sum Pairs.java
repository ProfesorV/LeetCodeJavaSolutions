//Ingredients: int[], Map<Integer, Integer>,  three ints for control
class Solution {
    //int[], int
  public int maxOperations(int[] nums, int k) {
      //map<Integer, Integer> set to create new
    Map<Integer, Integer> map = new HashMap<>();
      //int set to
    int count = 0;
      //for(int : int[]) foreach condition
    for (int num : nums) {
        //if(map (int-int,0)>0) if condition
      if (map.getOrDefault(k - num, 0) > 0) {
          //int increment
        count++;
          //map<int,int> (int - int, map<int,int>(int - int, 0)-1) apply function
        map.put(k - num, map.getOrDefault(k - num, 0) - 1);
      } else {
        //map<int, int> (int, map<int,int>(int,0)+1) apply function
        map.put(num, map.getOrDefault(num, 0) + 1);
      }
    }
      // int return
    return count;
  }
}
