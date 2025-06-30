import java.util.LinkedList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class TryAdvanceExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        
        Spliterator<String> spliterator = fruits.spliterator();

       
        System.out.println("Using tryAdvance():");
        while (spliterator.tryAdvance((fruit) -> {
            System.out.println("Fruit: " + fruit);
        })) {
            
        }
    }
}