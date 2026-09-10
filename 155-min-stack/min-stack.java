class Node {
    int value;
    int min;
    Node next;

    Node(int value, int min) {
        this.value = value;
        this.min = min;
    }
}

class MinStack {
    Node head;

    public MinStack() {
    }

    public void push(int value) {
        if (head == null) {
            head = new Node(value, value);
        } else {
            Node temp = new Node(value, Math.min(value, head.min));
            temp.next = head;
            head = temp;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        if (head == null) return -1;
        return head.value;
    }

    public int getMin() {
        if (head == null) return -1;
        return head.min;
    }
}