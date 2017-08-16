
package datastructures;

public class StringStack{

    protected String[] stack; //array declaration

    //Encapsulation - Using Private access modifiers
    protected int top;
    protected int maxSize; //Cannot be changed for that object    
    //removing item from stack - Last in first Out(LIFO)
    public String pop() {
        if (isEmpty()) {
            System.out.println("ERROR! Cant pop empty Stack");
            return "";
        } else {
            return stack[top--];
        }
    }

    //Returns last/top item

    public String peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return "";
        }
    }
        
    public void printStack() {
        //System.out.println("length is "+ stack.length); //Debugging
        for (int list = 0; list <= top; list++) {
            System.out.print(stack[list] + " ");
        }
    }
        
    //Default constructor
    public StringStack() {
        maxSize = 10;
        top = -1;
        stack = new String[10];
    }

    //Polymorphism - Constructor Overload
    public StringStack(int size) {//parameterised constructor
        maxSize = size;
        top = -1;
        stack = new String[maxSize];
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
    public boolean push(String item) {
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
