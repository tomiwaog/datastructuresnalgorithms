package datastructures;

public class DataStructures {

    public static void main(String[] args) {
        //Instack Object instantiation
        StringStack mystack = new StringStack(2);
        mystack.push("hello");
        mystack.push("hellow");
        mystack.push("helloworld");
        mystack.printStack();
    }

}
