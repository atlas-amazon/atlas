public class LinkedList<T> {
    Node<T> head;

    // Inner generic Node class
    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T value) {
            data = value;
            next = null;
        }
    }

    // Insert at end
    public void insertAtEnd(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Display the list
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Delete by value
    public void deleteByValue(T value) {
        if (head == null) return;

        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(value)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Main to test
    public static void main(String[] args) {
        // Create LinkedList of Strings
        LinkedList<String> stringList = new LinkedList<>();
        stringList.insertAtEnd("Hello");
        stringList.insertAtEnd("World");
        stringList.display();

        // Create LinkedList of Integers
        LinkedList<Integer> intList = new LinkedList<>();
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);
        intList.display();

        // Create LinkedList of Doubles
        LinkedList<Double> floatList = new LinkedList<>();
        floatList.insertAtEnd(10.5);
        floatList.insertAtEnd(20.75);
        floatList.display();
    }
}