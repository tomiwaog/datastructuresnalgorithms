package datastructures;

public class IntStack {

    //Private access modifiers- form of encapsulation
    private int[] stack; //array declaration
    private int top;
    private int maxSize;
    private int length;

    //Default constructor
    public IntStack() {
        maxSize = 10;
        top = -1;
        stack = new int[3];
    }

    //parameterised constructor
    public IntStack(int size) {
        maxSize = size;
        top = -1;
        stack = new int[maxSize];
    }

    //boolean method pusing item into stack array
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

    //removing item from stack - Last in first out(LIFO)
    public int pop() {
        if (isEmpty()) {
            System.out.println("ERROR! Cant pop empty Stack");
            return -1;
        } else {
            stack[top] = 0;
            return stack[top--];
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
   
  
    public void printStack(){
        //System.out.println("length is "+ stack.length); //Debugging
        for (int list=0; list<= top; list++)
            System.out.print(stack[list]+ " ");
    }
    
//If stack is empty method
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public int peek(){
        if(!isEmpty()){
            return stack[top];
        }
        else 
            return -1;
    }
}
