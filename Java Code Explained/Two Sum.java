//Ingredients: two int arrays, one map<int,int>, and an int.
class Solution {
    //int[], int
    public int[] twoSum(int[] num, int target) {
        //int [] set to create new
        int[] ans = new int[2];
        //Map<int, int> set to create new
        Map<Integer, Integer> map = new HashMap<>();
        // for(int<int[].length) for condition
        for (int i=0;i<num.length;i++) {
            //if(map<integer, integer> .containsKey() int - int[int]) if condition
            if (map.containsKey(target - num[i])) {
                //int[1] = int set to
                ans[1] = i;
                //int[0] = map<integer,integer>.get() int - int[int] set to apply function
                ans[0] = map.get(target - num[i]);
                //int[] return
                return ans;
            }
            //map<integer, integer>.put() int[int], int apply function
            map.put(num[i], i);
        }
        // int[] return
        return ans;
    }
}
