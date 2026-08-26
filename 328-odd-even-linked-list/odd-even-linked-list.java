class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);

        ListNode t1 = odd;
        ListNode t2 = even;
        ListNode t = head;

        while (t != null) {

            // odd node
            t1.next = t;
            t1 = t1.next;
            t = t.next;

            // even node
            if (t != null) {
                t2.next = t;
                t2 = t2.next;
                t = t.next;
            }
        }

        // VERY IMPORTANT: break old link
        t2.next = null;

        // Join odd list with even list
        t1.next = even.next;

        return odd.next;
    }
}