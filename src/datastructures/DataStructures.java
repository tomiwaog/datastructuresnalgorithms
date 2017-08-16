package datastructures;

public class DataStructures {

    public static void main(String[] args) {
        //Instack Object instantiation
        ArrListStackStr mystack = new ArrListStackStr(4);
        mystack.push("Tomiwa");
        mystack.push("Titi");
        mystack.push("Bola");
        mystack.push("Sikiru");
        mystack.push("Moshood");
        mystack.printStack();
        System.out.print("\n--- Running peek\n ---");
        System.out.println(mystack.peek());
        System.out.print("\n--- Running Remove\n ---");
        System.out.println(mystack.pop());
    }

}
