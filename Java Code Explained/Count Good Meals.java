//Ingredients: int[], Hashset<Integer>, HashMap<Integer,Integer>, and four ints for control flow
class Solution {
    //int[]
    public int countPairs(int[] deliciousness) {
        //int set to calculate
        int MOD = (int) Math.pow(10, 9) + 7;
            //int set to
        int res = 0;
        //Hashset<Integer> set to create new
        HashSet<Integer> set = new HashSet<>();
        //int = int[].length set to
        int len = deliciousness.length;
        //for (int < int) for condition
        for (int i = 0; i < len; i++) {
            //Hashset<Integer>.add(2,int) apply function
            set.add((int) Math.pow(2, i));
            }
        //HashMap<Integer, Integer> set to create new
        HashMap<Integer, Integer> map = new HashMap<>();
        //for(int < int) for condition
        for (int i = 0; i < len; i++) {
            //for(int:Hashset<Integer>) foreach condition
            for (int key : set) {
                //HashMap<Integer, Integer>.containsKey() (int-int[int]) if condition
                if (map.containsKey(key - deliciousness[i])) {
                    //int += HashMap<Integer,Integer>(int-int[int]) augment by
                    res += map.get(key - deliciousness[i]);
                    //int %= int modulus by
                    res %= MOD;
                }
            }
            //HashMap<int,int>.put() int[int], HashMap<int,int>. getOrDefault() int[int],0 + 1 
            //apply function
            map.put(deliciousness[i], map.getOrDefault(deliciousness[i], 0) + 1);
        }
        //int return
        return res;
    }
}
