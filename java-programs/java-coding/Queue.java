
import java.util.Scanner;

class Queue {
    int[] queue;
    int front, rear, size, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

   
    boolean isEmpty() {
        return size == 0;
    }

    
    boolean isFull() {
        return size == capacity;
    }

    
    void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear++;
        queue[rear] = element;
        size++;
    }

   
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int temp = queue[front];
        front++;
        size--;
        return temp;
    }

    
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

   
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue elements:");
        queue.display(); 
        System.out.println("Front element: " + queue.peek()); 
        System.out.println("Dequeued element: " + queue.dequeue()); 
        System.out.println("Queue elements after dequeue:");
        queue.display(); 
    }
}