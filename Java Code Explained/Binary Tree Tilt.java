/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  //TreeNode
  public int findTilt(TreeNode root) {
    //int[]
    int[] total = {0};
    //helper
    helper(root, total);
    //return int[]
    return total[0];
  }
  //TreeNode, int[]
  private int helper(TreeNode root, int[] total) {
    //if condition (TreeNode == null)
    if (root == null) {
      return 0;
    }
    //set to helper(TreeNode.TreeNode, int[])
    int left = helper(root.left, total);
    int right = helper(root.right, total);
    //augment by .abs(int-int)
    total[0] += Math.abs(left - right);
    //return int + int + TreeNode.int
    return left + right + root.val;
  }
}