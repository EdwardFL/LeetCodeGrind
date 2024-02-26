package StackImplementation;

public class MyLinkedListStack {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    public boolean isEmpty() {
        return (head == null);
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;

        return top;
    }

    public int peek() {
        if (isEmpty())
            return -1;
        return head.data;
    }
}
