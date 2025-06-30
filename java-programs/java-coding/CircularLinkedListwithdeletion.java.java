public class CircularLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Method to add a node
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;  // circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Method to display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Method to delete a node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        Node previous = tail;

        do {
            if (current.data == value) {
                // Deleting the only node
                if (head == tail && head.data == value) {
                    head = null;
                    tail = null;
                }
                // Deleting head
                else if (current == head) {
                    head = head.next;
                    tail.next = head;
                }
                // Deleting tail
                else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                }
                // Deleting middle node
                else {
                    previous.next = current.next;
                }

                System.out.println("Deleted value: " + value);
                return;
            }

            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Value " + value + " not found.");
    }

    // Main method to test
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.add(40);

        cll.display(); // Before deletion

        cll.delete(30);  // Delete node with value 30
        cll.display(); // After deletion

        cll.delete(10);  // Delete head
        cll.display();

        cll.delete(40);  // Delete tail
        cll.display();

        cll.delete(20);  // Delete last remaining node
        cll.display();   // List is empty now
    }
}