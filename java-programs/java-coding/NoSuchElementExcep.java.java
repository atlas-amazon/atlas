import java.util.NoSuchElementException;

class Node<T> {
    T data;
    Node<T> next;

    Node(T value) {
        this.data = value;
        this.next = null;
    }
}

class CustomLinkedList<T> {
    private Node<T> head;
    private int size;

    public CustomLinkedList() {
        head = null;
        size = 0;
    }

    // Add element at the end
    public void insertAtEnd(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    // Remove node by value
    public void removeByValue(T value) {
        if (head == null) return;

        if (head.data.equals(value)) {
            head = head.next;
            size--;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(value))
            temp = temp.next;

        if (temp.next != null) {
            temp.next = temp.next.next;
            size--;
        }
    }

    // Remove node at index
    public void removeAtIndex(int index) {
        checkIndex(index);
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++)
                temp = temp.next;
            temp.next = temp.next.next;
        }
        size--;
    }

    // Get element at index
    public T get(int index) {
        checkIndex(index);
        Node<T> temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp.data;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Get size
    public int getSize() {
        return size;
    }

    // Index bounds check
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
    }
}

public class Main {
    public static void main(String[] args) {
        // Integer LinkedList
        CustomLinkedList<Integer> intList = new CustomLinkedList<>();
        intList.insertAtEnd(10);
        intList.insertAtEnd(20);
        intList.insertAtEnd(30);
        System.out.println("Integer Linked List:");
        intList.display();

        intList.removeByValue(20);
        System.out.println("After removing 20:");
        intList.display();

        intList.removeAtIndex(1);
        System.out.println("After removing index 1:");
        intList.display();

        System.out.println("Size: " + intList.getSize());

        // String LinkedList
        CustomLinkedList<String> strList = new CustomLinkedList<>();
        strList.insertAtEnd("Apple");
        strList.insertAtEnd("Banana");
        strList.insertAtEnd("Cherry");

        System.out.println("\nString Linked List:");
        strList.display();
        System.out.println("Element at index 1: " + strList.get(1));
}
}
