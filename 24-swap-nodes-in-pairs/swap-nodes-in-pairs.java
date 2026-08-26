class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode c = dummy;

        while (c.next != null && c.next.next != null) {

            ListNode a = c.next;
            ListNode b = a.next;

            // Swap
            c.next = b;
            a.next = b.next;
            b.next = a;

            // Move to next pair
            c = a;
        }

        return dummy.next;
    }
}