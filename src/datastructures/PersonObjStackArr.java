package datastructures;

public class PersonObjStackArr {

    //Encapsulation - Using Private access modifiers
    private Person[] stack; //array declaration
    private int top;
    private final int maxSize; //Cannot be changed for that object

    //Default constructor
    public PersonObjStackArr() {
        maxSize = 10;
        top = -1;
        stack = new Person[maxSize];
    }

    //Polymorphism - Constructor Overload
    public PersonObjStackArr(int size) {//parameterised constructor
        maxSize = size;
        top = -1;
        stack = new Person[maxSize];
    }

    //boolean method pusing item into stack array
    public boolean push(Person item) {
        if (!isFull()) {
            top++;
            stack[top] = item;
            return true;
        } else {
            System.out.println("ERROR! FULL STACK!! Cannot add " + item);
        }
        return true;
    }

    //removing item from stack - Last in first out(LIFO)
    public Person pop() {
        return stack[top--];
    }

    //If stack is full
    public boolean isFull() {
        if (top == stack.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void printStack() {
        //System.out.println("length is "+ stack.length); //Debugging
        if (top == -1) {
            System.out.println("Empty! Nothing to print here!");
        }
            else{
            for (int list = 0; list <= top; list++) {
                System.out.print(stack[list] + " ");
            }
        }
    }
        //If stack is empty method
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    //Returns last / top item
    public Person peek() {
        return stack[top]; //Returns the top object LIFO
    }
}
