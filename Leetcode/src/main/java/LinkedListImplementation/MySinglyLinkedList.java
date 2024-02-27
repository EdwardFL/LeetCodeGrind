package LinkedListImplementation;

public class MySinglyLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node head;
    private Node tail;


    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int deleteFromBeginning() {
        int deletedValue;
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            deletedValue = head.data;
            head = null;
            return deletedValue;
        }

        deletedValue = head.data;
        head = head.next;
        return deletedValue;
    }

    public void deleteAtSpecificNode(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void deleteFromTail() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

    }
    public void insertAfterAGivenNode(Node prevNode, int data) {
        if (prevNode == null) {
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void insertAtTheEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }

        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public int getCount() {
        int count = 0;
        Node nodeCounter = head;
        if (head == null) {
            return 0;
        }
        while (nodeCounter != null) {
            count++;
            nodeCounter = nodeCounter.next;
        }

        return count;
    }

    public Node findNode(int data) {
        Node node = head;
        while (node != null) {
            if (node.data == data) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node node = head;

        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }
}
