class Solution {
  //int[], int
  public List<String> buildArray(int[] target, int n) {
    //ArrayList<>
    List<String> ans = new ArrayList<>();
    //strings
    final String PUSH = "Push";
    final String POP = "Pop";
    //ints
    int idx = 0;
    int curr = 1;
    //while condition (int < int[].length)
    while (idx < target.length) {
      //ArrayList<>.add(String)
      ans.add(PUSH);
      //if(int[int]==int)
      if (target[idx] == curr) {
        //int
        idx++;
      }
      //else
      else {
        //ArrayList<>.add(String)
        ans.add(POP);
      }
      //increment
      curr++;
    }
    //return
    return ans;
  }
}
