/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        ListNode cur = A;
        while (A.next != null) {
            if (A.val == A.next.val) {
                A.val = A.next.val;
                A.next = A.next.next;
            } else {
                A = A.next;
            }
        }
        return cur;
    }
}
