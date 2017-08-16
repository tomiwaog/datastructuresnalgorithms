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
        
        /*//Testing Person Stack
        PersonStack newPStack = new PersonStack(2); //New Stack Bucket
        Person person1 = new Person("Tomiwa", 28);
        Person person2 = new Person("Adetona", 15);
        newPStack.push(person1);
        newPStack.push(person2);
        System.out.println("After pushing");
        newPStack.printStack();
        System.out.println("\nNow popping");
        newPStack.pop();
        //newPStack.pop();
        newPStack.printStack();
        */
    }

}
