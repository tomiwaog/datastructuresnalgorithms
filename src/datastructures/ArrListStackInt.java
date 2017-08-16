package datastructures;

import java.util.ArrayList;

public class ArrListStackInt {
    private ArrayList<Integer> stack; //array declaration
    private int maxSize;

    //Encapsulation - Using Private access modifiers
    protected int top; 
    
    //Default constructor
    public ArrListStackInt(int maxSize) {
        this.maxSize = maxSize;
        top = -1;
        stack = new ArrayList<>();
    }
   
    //removing item from stack - Last in first Out(LIFO)
    public int pop() {
        if (isEmpty()) {
            System.out.println("ERROR! Cant pop empty Stack");
            return -1;
        } else {
            return stack.remove(top--);
        }
    }

    //Returns last/top item
    public int peek() {
        if (!isEmpty()) {
            return (stack.get(top));
        } else {
            System.out.println("Empty Stack");
            return -1;
        }
    }
        
    public void printStack() {
        //System.out.println("length is "+ stack.length); //Debugging
        for (int x: stack) {
            System.out.print(x);
        }
    }
            
    //If stack is empty method - Boolean type
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    //If stack is full
    public boolean isFull() {
        if (top == maxSize-1) {
            return true;
        } else {
            return false;
        }
    }
    
    //boolean method pusing item into stack array
    public boolean push(int item) {
        if (!isFull()) {
            top++;
            stack.add(item);
            return true;
        } else {
            System.out.println("ERROR! FULL STACK!! Cannot add " + item);
            return false;
        }
    }
}