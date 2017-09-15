/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      return addLists(l1, l2, 0);
    }
    public ListNode addLists(ListNode l1, ListNode l2, int c){
      while(l1 != null || l2 != null) {
        int pVal = (l1 != null)? l1.val: 0;
        int qVal = (l2 != null)? l2.val: 0;
        ListNode cur = new ListNode((pVal + qVal + c) %10);
        cur.next =  addLists((l1 != null)? l1.next: null, (l2 != null)? l2.next: null, ((pVal + qVal + c) / 10));
        return cur;
      }
      if(c != 0){
        return new ListNode(c);
      } else {
        return null;
      }
    }
}
