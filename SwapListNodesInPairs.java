/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }
        int counter = 0;
        ListNode newHead = A;
        while (A.next != null) {
            // if 0, 2, etc - swap
            if (counter % 2 == 0) {
                int currVal = A.val;
                A.val = A.next.val;
                A.next.val = currVal;
            }
            counter += 1;
            A = A.next;
        }
        return newHead;
    }
}
