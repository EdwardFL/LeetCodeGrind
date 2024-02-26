package StackImplementation;

public class Main {

    public static void main(String[] args) {
        MyArrayStack myArrayStack = new MyArrayStack(10);

        myArrayStack.isEmpty();
        myArrayStack.push(10);
        myArrayStack.push(20);
        myArrayStack.push(30);
        myArrayStack.push(40);
        myArrayStack.display();
        myArrayStack.push(50);
        System.out.println("Top element: " + myArrayStack.peek());
        myArrayStack.pop();
        System.out.println("Top element: " + myArrayStack.peek());
        myArrayStack.pop();
        myArrayStack.display();

        System.out.println("\n");
        System.out.println("==================================");
        System.out.println("\n");

        MyArrayListStack myArrayListStack = new MyArrayListStack();
        myArrayListStack.push(10);
        myArrayListStack.push(20);
        myArrayListStack.push(30);
        myArrayListStack.push(40);
        myArrayListStack.display();
        System.out.println("Top element: " + myArrayListStack.peek());
        myArrayListStack.pop();
        System.out.println("Top element: " + myArrayListStack.peek());
        myArrayListStack.pop();
        myArrayListStack.display();

        System.out.println("\n");
        System.out.println("==================================");
        System.out.println("\n");

        MyLinkedListStack myLinkedListStack = new MyLinkedListStack();
        myLinkedListStack.push(10);
        myLinkedListStack.push(20);
        myLinkedListStack.push(30);
        myLinkedListStack.push(40);
        while (!myLinkedListStack.isEmpty()) {
            System.out.println(myLinkedListStack.peek());
            myLinkedListStack.pop();
        }

    }
}
