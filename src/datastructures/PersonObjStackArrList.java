package datastructures;

import java.util.ArrayList;

public class PersonObjStackArrList {

    //Encapsulation - Using Private access modifiers
    private ArrayList<Person> stack; //array declaration
    private int top;
    private final int maxSize; //Cannot be changed for that object

    //Default constructor
    public PersonObjStackArrList() {
        maxSize = 10;
        top = -1;
        stack = new ArrayList<>();
    }

    //Polymorphism - Constructor Overload
    public PersonObjStackArrList(int size) {//parameterised constructor
        maxSize = size;
        top = -1;
        stack = new ArrayList<>();
    }

    //boolean method pusing item into stack array
    public boolean push(Person item) {
        if (!isFull()) {
            top++;
            stack.add(item);
            return true;
        } else {
            System.out.println("ERROR! FULL STACK!! Cannot add " + item);
        }
        return true;
    }

    //removing item from stack - Last in first out(LIFO)
    public Person pop() {
        if (!isEmpty()) {
            return stack.remove(top--);
        } else {
            System.out.println("Cannot pop empty stack");
            return null;
        }
    }

    //If stack is full
    public boolean isFull() {
        if (top == stack.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void printStack() {
        //System.out.println("length is "+ stack.length); //Debugging
        if (top == -1) {
            System.out.println("Empty! Nothing to print here!");
        } else {
            for (int list = 0; list <= top; list++) {
                System.out.print(stack.get(list));
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
        if (!isEmpty()) {
            return (stack.get(top));
        } else {
            System.out.println("cant peek empty stack");
            return null;
        }
    }
}
