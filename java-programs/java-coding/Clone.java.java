import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<String> list = new LinkedList<>();

       
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

       
        System.out.println("Original LinkedList: " + list);

       
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();

       
        System.out.println("Cloned LinkedList: " + clonedList);

       
        list.add("Elderberry");

       
        System.out.println("Original LinkedList after modification: " + list);
        System.out.println("Cloned LinkedList after modification: " + clonedList);
    }
}