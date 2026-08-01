/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = length(headA);
        int lenB = length(headB);

        int k = Math.abs(lenA-lenB);
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;

         if (lenA > lenB) {
            while (k-- > 0) {
                temp1 = temp1.next;
            }
        } else {
            while (k-- > 0) {
                temp2 = temp2.next;
            }
        }

        // Find the meeting point
        while (temp1 != null && temp2 != null) {

            if (temp1 == temp2) {
                return temp1;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;

        
        
    }
    public int length(ListNode head){
        int count =0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}