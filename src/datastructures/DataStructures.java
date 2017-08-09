package datastructures;

public class DataStructures {

    public static void main(String[] args) {
        //Instack Object instantiation
        IntStack mystack = new IntStack(3); 
        //Control structures
        if (!mystack.isFull()) { //mystack invoking method
            mystack.push(5);
            mystack.push(10);
            mystack.push(15);
            mystack.push(20);
            mystack.push(25);
            mystack.push(555);
        } else {
            System.out.println("YES its is full");
        }
         
        //mystack.pop(); //method invocation
        mystack.printStack();

    }

}
