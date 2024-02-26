package StackImplementation;

public class MyArrayStack {

    int top;
    int size;
    int[] stack;

    MyArrayStack(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public void push(int element) {
        if (!this.isFull()) {
            top++;
            stack[top] = element;
            System.out.println("Pushed element: " + element);
        } else {
            System.out.println("Stack is full! Overflow");
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty! Underflow");
            return -1;
        } else {
            int poppedElement = top;
            top--;
            System.out.println("Popped element: " + stack[poppedElement]);
            return stack[poppedElement];
        }
    }

    public void display() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
