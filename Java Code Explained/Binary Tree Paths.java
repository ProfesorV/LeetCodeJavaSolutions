/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  //List<String>
  List<String> list;
  //TreeNode
  public List<String> binaryTreePaths(TreeNode root) {
    //set to create new ArrayList<
    list = new ArrayList<>();
   //if condition (TreeNode == null)
    if (root == null) {
      //return
      return list;
    }
    //helper (TreeNode, new StringBuilder())
    helper(root, new StringBuilder());
    //return
    return list;
  }
  //TreeNode, StringBuilder
  private void helper(TreeNode root, StringBuilder sb) {
    //if condition (TreeNode)
    if (root == null) {
      //return
      return;
    }
    //if condition (TreeNode.TreeNode == null && == null)
    if (root.left == null && root.right == null) {
      //.append()
      sb.append(root.val);
      //.add(.toString)
      list.add(sb.toString());
    }
    //else conditio
    else {
      //.append() .append()
      sb.append(root.val).append("->");
      //helper (TreeNode.TreeNode create new StringBuilder(.toString()))
      helper(root.left, new StringBuilder(sb.toString()));
      helper(root.right, new StringBuilder(sb.toString()));
    }
  }
}