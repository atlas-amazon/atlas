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
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }
        rear++;
        queue[rear] = element;
        size++;
        System.out.println("Enqueued: " + element);
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int temp = queue[front];
        front++;
        size--;
        System.out.println("Dequeued: " + temp);
        return temp;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return queue[front];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    void checkEmptyStatus() {
        if (isEmpty()) {
            System.out.println("Queue is currently EMPTY.");
        } else {
            System.out.println("Queue is NOT empty.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

       
        queue.display();

        
        System.out.println("Front element (peek): " + queue.peek());

       
        queue.dequeue();

        
        queue.display();

        
        System.out.println("Front element (peek after dequeue): " + queue.peek());

        
        queue.checkEmptyStatus();

     
        queue.dequeue();
        queue.dequeue();

       
        queue.display();
        queue.checkEmptyStatus();
    }
}