import java.util.*;

interface SortingStrategy {
    void sort(List<String> items);
}

class AlphabeticalSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        Collections.sort(items, String.CASE_INSENSITIVE_ORDER);
    }
}

class LengthSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        Collections.sort(items, Comparator.comparingInt(String::length).reversed());
    }
}

class SortingContext {
    private List<String> items;
    private SortingStrategy strategy;

    public SortingContext() {
        items = new ArrayList<>();
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void performSort() {
        if (strategy != null) {
            strategy.sort(items);
        } else {
            System.out.println("No sorting strategy set.");
        }
    }

    public List<String> getItems() {
        return items;
    }
}

public class Main {
    public static void main(String[] args) {
        SortingContext context = new SortingContext();

        context.addItem("Stanford");
        context.addItem("Ankit");
        context.addItem("Watson");

        System.out.println("Alphabetical Sorting:");
        context.setStrategy(new AlphabeticalSortStrategy());
        context.performSort();
        for (String item : context.getItems()) {
            System.out.println(item);
        }

        System.out.println("\nLengthwise Sorting:");
        context.setStrategy(new LengthSortStrategy());
        context.performSort();
        for (String item : context.getItems()) {
            System.out.println(item);
        }
    }
}