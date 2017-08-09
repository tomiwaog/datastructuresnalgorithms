package datastructures;
public class DataStructures {

    public static void main(String[] args) {
        // TODO code application logic here
        IntStack mystack = new IntStack(5);
        if (!mystack.isFull()){
            mystack.push(5);
            mystack.push(10);
            mystack.push(15);
            mystack.push(20);
            mystack.push(25);
            mystack.push(555);
        }
        else
            System.out.println("YES its is full");
        
        for (int i=0;i<5;i++){
            mystack.pop();
        }
    }
    
}
