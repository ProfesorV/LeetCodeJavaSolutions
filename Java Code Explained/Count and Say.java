//Ingredients: Int, String, Stringbuilder, 3 ints
class Solution {
  //int
  public String countAndSay(int n) {
    //string set to
    String s = "1";
    //for(int < int) for condition
    for (int i = 1; i < n; i++) {
      //StringBuilder set to create new
      StringBuilder sb = new StringBuilder();
      //for (int, int; int <= String.length()) for condition
      for (int j = 1, count = 1; j <= s.length(); j++) {
        //if(int == String.length() || String .charAt(int-1) != String.charAt(int))) if condition
        if (j == s.length() || s.charAt(j - 1) != s.charAt(j)) {
          //StringBuilder.append(int) apply function
          sb.append(count);
          //StringBuilder.append(String.charAt(int-1)) apply function
          sb.append(s.charAt(j - 1));
          //int=1 set to
          count = 1;
        } else {
          //int++ increment
          count++;
        }
      }
      //String = StringBuilder.toString() set to apply function
      s = sb.toString();
    }
    //String return
    return s;
  }
}
