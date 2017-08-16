package datastructures;

public class IntStackArr implements InterfaceStack{
    protected int[] stack; //array declaration

    //Encapsulation - Using Private access modifiers
    protected int top;
    protected int maxSize; //Cannot be changed for that object    
    //removing item from stack - Last in first Out(LIFO)
    public int pop() {
        if (isEmpty()) {
            System.out.println("ERROR! Cant pop empty Stack");
            return -1;
        } else {
            stack[top] = 0;
            return stack[top--];
        }
    }

    //Returns last/top item
    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return -1;
        }
    }
        
    public void printStack() {
        //System.out.println("length is "+ stack.length); //Debugging
        for (int list = 0; list <= top; list++) {
            System.out.print(stack[list] + " ");
        }
    }
        
    //Default constructor
    public IntStackArr() {
        maxSize = 10;
        top = -1;
        stack = new int[10];
    }

    //Polymorphism - Constructor Overload
    public IntStackArr(int size) {//parameterised constructor
        maxSize = size;
        top = -1;
        stack = new int[maxSize];
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
        if (top == stack.length - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    //boolean method pusing item into stack array
    public boolean push(int item) {
        if (!isFull()) {
            top++;
            stack[top] = item;
            return true;
        } else {
            System.out.println("ERROR! FULL STACK!! Cannot add " + item);
            return false;
        }
    }
}
