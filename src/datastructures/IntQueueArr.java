package datastructures;

public class IntQueueArr {

    private int[] queue = new int[10];
    private final int maxSize;
    private int front;
    private int rear;

    IntQueueArr(int maxSize) {
        front = -1;
        rear = -1;
        this.maxSize = maxSize;
    }

    public int front() {
        if (!isEmpty()) {
            return queue[0];
        } else {
            return -1;
        }
    }

    public int rear() {
        if (isEmpty()){
            return -1;
        }else
            return queue[rear];
    }

    public void enqueue(int number) {
        if (!isFull()) { //Cant add to a full queue
            if (isEmpty()) {
                rear +=1; // If both are empty increment both by 1(i.e. zero)
                front=rear;
                queue[0] = number;
            } else {
                rear += 1;
                queue[rear] = number; //if not empty only make rear +1 then assign
            }
        } else {
            System.out.println("Queue is Full! Cant add "+number);
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            if (rear == front) //i.e. if front and read are 1 //just 1 item in queue
            {
                front = rear -= 1; //make both of them empty
            }
            else
                rear -= 1;
        } else {
            System.out.println("can deque already empty list");
        }
    }

    public void printQueue() {
        for (int num=0; num<=rear;num++)
            System.out.print(queue[num]+ " ");
        System.out.println();
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return size() == maxSize;
    }

    public int size() {
        return rear + 1;
    }
}
