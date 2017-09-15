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
        int c = 0;
        ListNode head0 = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode cur = head0;
        while(p != null || q != null) {
            int pVal = (p != null)? p.val: 0;
            int qVal = (q != null)? q.val: 0;
            if(p != null) {
                p = p.next;
            }
            if(q != null) {
                q = q.next;
            }
            cur.next = new ListNode((c + pVal + qVal)%10);
            cur = cur.next;
            c = (c+pVal+qVal)/10;
        }
        if(c != 0){
            cur.next = new ListNode(c);
        }
        return head0.next;
    }
}
