class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; 
            return;
        }
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head; 
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        
        if (head.data == data) {
            if (head.next == head) {
                head = null;
                return;
            }
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != head && current.next.data != data) {
            current = current.next;
        }

        if (current.next.data == data) {
            current.next = current.next.next;
        } else {
            System.out.println("Node not found.");
        }
    }


    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println(" " + head.data + ")");
    }
}


public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.append(1);
        circularList.append(2);
        circularList.append(3);
        circularList.append(4);

        System.out.println("Traversed list:");
        circularList.traverse();

        System.out.println("Deleting node 2:");
        circularList.delete(2);
        circularList.traverse();

    }
}
