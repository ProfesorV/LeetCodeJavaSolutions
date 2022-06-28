//Ingredients: int[], List<List<Integer>>, List<Integer>, boolean[], 1 int
class Solution {
  //int[]
  public List<List<Integer>> permuteUnique(int[] nums) {
    //List<List<Integer>> set to create new
    List<List<Integer>> result = new ArrayList<>();
    //sort(int[]) apply function
    Arrays.sort(nums);
    //helper(int[], List<List<Integer>>,new ArrayList, boolean[int[].length]) function
    helper(nums, result, new ArrayList<>(), new boolean[nums.length]);
    //return
    return result;
  }
  //int[], List<List<Integer>>, List<Integer>, boolean[]
  private void helper(int[] nums, List<List<Integer>> result, List<Integer> curr, boolean[] visited) {
    //if(List<Integer>.size() == int[].length if condition
    if (curr.size() == nums.length) {
      //List<List<Integer>>.add(new ArrayList<>(List<Integer>)) apply function
      result.add(new ArrayList<>(curr));
      return;
    }
    //for(int < int[].length) for condition
    for (int i = 0; i < nums.length; i++) {
      //if (boolean[int] || (int > 0 && int[int] == int[int -1] && !boolean[int-1]) 
      //if condition
      if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
        continue;
      }
      //List<Integer>.add(int[int]) apply function
      curr.add(nums[i]);
      //boolean[int] = true set to
      visited[i] = true;
      //helper(int[], List<List<Integer>>, List<Integer>, boolean[]) function
      helper(nums, result, curr, visited);
      //List<Integer>.remove(List<Integer>.size()-1) apply function
      curr.remove(curr.size() - 1);
      //boolean[int] = false set to
      visited[i] = false;
    }
  }
}
