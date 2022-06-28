//Ingredients String [], Int [], Map<String,Integer>, String, three ints, 1 char
class Solution {
    public int romanToInt(String s) {
    //String [] set to
    String[] keys = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    //Int [] set to
    int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    //Map<String,Integer> set to creste new
    Map<String, Integer> map = new HashMap<>();
    //for (int < string [].length) for condition
    for (int i = 0; i < keys.length; i++) {
      //Map<String, Integer>. put() string[int], int[int] apply function
      map.put(keys[i], values[i]);
    }
        //int set to
    int val = 0;
        //int set to
    int idx = 0;
        //int set to
    int n = s.length();
        //while(int < int) while condition
    while (idx < n) {
        //char(int)=string.charAt(int) set to
      char c = s.charAt(idx);
        //if(int + 1 < int && map<string,int>.containsKey() string.substring() (int, int+2))
        //if condition
      if (idx + 1 < n && map.containsKey(s.substring(idx, idx + 2))) {
          //int += map<string,int>.get()string(int, int+2) agument by
        val += map.get(s.substring(idx, idx + 2));
          //int+=2 agument by
        idx += 2;
      }
      else {           
          //int += map<string,int>.get() string.valueOf(char) augment by
        val += map.get(String.valueOf(c));
          //int increment
        idx++;
      }
    }
        //int return
    return val;
  }
}
