import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class DManager {

    private static DManager instance;

    private final List<String> items;

    private DManager() {
        if (instance != null) {
            throw new IllegalStateException("Instance already exists. Use getInstance().");
        }
        items = Collections.synchronizedList(new ArrayList<>());
    }

    public static synchronized DManager getInstance() {
        if (instance == null) {
            instance = new DManager();
        }
        return instance;
    }

    public synchronized void addItem(String item) {
        items.add(item);
    }

    public synchronized void removeItem(String item) {
        items.remove(item);
    }

    public synchronized List<String> getItems() {
        return new ArrayList<>(items); 
    }
}

public class Main {
    public static void main(String[] args) {
        DManager manager = DManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter items (type 'Done' to finish input):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Done")) {
                break;
            }
            manager.addItem(input);
        }

        System.out.println("Enter item to remove:");
        String toRemove = scanner.nextLine();
        manager.removeItem(toRemove);

        System.out.println("Final list:");
        for (String item : manager.getItems()) {
            System.out.println(item);
        }

        scanner.close();
    }
}