//Ingredients: 4 ListNodes, 2 ints
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //ListNode x2
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      //ListNode set to create new
    ListNode root = new ListNode(-1);
      //ListNode set to
    ListNode curr = root;
      //int set to
    int carry = 0;
      //while(ListNode != null || ListNode != null || int !=0) while condition
    while (l1 != null || l2 != null || carry != 0) {
        //int set to
      int currSum = carry;
        //if(ListNode != null && ListNode != null) if condition
      if (l1 != null && l2 != null) {
          //int += ListNode.int + ListNode.int agument by
        currSum += l1.val + l2.val;
          //ListNode = ListNode.ListNode set to
        l1 = l1.next;
        l2 = l2.next;
          //else if (ListNode != null && ListNode == null) else condition
      } else if (l1 != null && l2 == null) {
          //int += ListNode.int agument by
        currSum += l1.val;
          //ListNode = ListNode.ListNode set to
        l1 = l1.next;
          //else if (ListNode == null && ListNode != null) else condition
      } else if (l1 == null && l2 != null) {
         //int += ListNode.int agument by
        currSum += l2.val;
          // ListNode = ListNode.ListNode set to
        l2 = l2.next;
      }
        //int = int > 9 ? 1:0 set to compare
      carry = currSum > 9 ? 1 : 0;
        //int %= 10 modulus
      currSum %= 10;
        //ListNode.ListNode = ListNode(int) set to create new
      curr.next = new ListNode(currSum);
        //ListNode = ListNode.ListNode set to
      curr = curr.next;
    }
      //ListNode.ListNode return
    return root.next;
  }
}
