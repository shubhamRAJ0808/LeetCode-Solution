import java.math.BigInteger;

class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revL1 = reverse(l1);
        ListNode revL2 = reverse(l2);

        ListNode temp1 = revL1;
        StringBuilder sb = new StringBuilder();
        while(temp1 != null){
            sb.append(temp1.val);
            temp1 = temp1.next;
        }
        BigInteger num1 = new BigInteger(sb.toString());

        ListNode temp2 = revL2;
        StringBuilder tb = new StringBuilder();
        while(temp2 != null){
            tb.append(temp2.val);
            temp2 = temp2.next;
        }
        BigInteger num2 = new BigInteger(tb.toString());

        BigInteger sum = num1.add(num2);

        ListNode head = null;
        ListNode tail = null;

        String str = sum.toString();

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';

            ListNode newNode = new ListNode(digit);

            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return reverse(head);
    }
}