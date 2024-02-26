package StackImplementation;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListStack {

    private List<Integer> stack = new ArrayList<>();

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    public void push(int element) {
        stack.add(element);
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return top;
    }

    public void display() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }


}
