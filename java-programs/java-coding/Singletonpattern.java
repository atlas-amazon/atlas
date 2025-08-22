import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DManager {

    private static DManager instance;

    private List<String> itemList;

    private DManager() {
        if (instance != null) {
            throw new IllegalStateException("Instance already created! Use getInstance()");
        }
        itemList = Collections.synchronizedList(new ArrayList<>());
    }

    public static synchronized DManager getInstance() {
        if (instance == null) {
            instance = new DManager();
        }
        return instance;
    }

    public synchronized void addItem(String item) {
        itemList.add(item);
        System.out.println("Added: " + item);
    }

    public synchronized void removeItem(String item) {
        if (itemList.remove(item)) {
            System.out.println("Removed: " + item);
        } else {
            System.out.println("Item not found: " + item);
        }
    }

    public synchronized List<String> listItems() {
        return new ArrayList<>(itemList); 
    }
}
// public class Main {
//     public static void main(String[] args) {
//         DManager manager = DManager.getInstance();

//         manager.addItem("Task 1");
//         manager.addItem("Task 2");

//         System.out.println("Current Items: " + manager.listItems());

//         manager.removeItem("Task 1");

//         System.out.println("Updated Items: " + manager.listItems());
//     }
// }