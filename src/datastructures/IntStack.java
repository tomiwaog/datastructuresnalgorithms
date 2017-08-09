package datastructures;

public class IntStack {

    private int[] stack;
    private int top;
    private int maxSize;
    private int length;

    public IntStack() {
        maxSize = 10;
        top = -1;
        stack = new int[3];
    }

    public IntStack(int size) {
        maxSize = size;
        top = -1;
        stack = new int[maxSize];
    }

    public boolean push(int item) {
        if (!isFull()) {
            top++;
            stack[top] = item;
            return true;
        } else {
            System.out.println("ERROR! Cannot add "+item);
        }
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("ERROR! Cant pop empty Stack");
            return -1;
        } else {
            stack[top] = 0;
            return stack[top--];
        }
    }

    public boolean isFull() {
        if (top == stack.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
}
