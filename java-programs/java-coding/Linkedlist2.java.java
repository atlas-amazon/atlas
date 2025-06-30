import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Ganga");
        list.add("Yamuna");
        list.add("Kaveri");
        list.add("Godavari");
        System.out.println("Linked List:\n" + list);
        list.add(2, "River");

        System.out.println("Updated Linked List:\n " + list);

     list.addFirst("Water");
     System.out.println("Updated Linked List:\n " + list);
        list.addLast("Sea");
     System.out.println("Updated Linked List:\n " + list);
     String firstElement = list.getFirst();
     System.out.println("First Element:\n " + firstElement);
      String lastElement = list.getLast();
     System.out.println("Last Element:\n " + lastElement);
    //  String lastElement = list.removeLast();
    // System.out.println("Removed Element: " + lastElement);
    list.set(1, "Ocean");
    System.out.println("Final Linked List:\n " + list);
         
    
    }
}