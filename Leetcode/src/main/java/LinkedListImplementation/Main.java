package LinkedListImplementation;

public class Main {
    public static void main(String[] args) {
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();
        mySinglyLinkedList.insertAtBeginning(50);
        mySinglyLinkedList.insertAtBeginning(40);
        mySinglyLinkedList.insertAtBeginning(30);
        mySinglyLinkedList.insertAtBeginning(20);
        mySinglyLinkedList.insertAtBeginning(10);

        System.out.println(mySinglyLinkedList.getCount());
        mySinglyLinkedList.display();
    }
}
