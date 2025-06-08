enum Color {
    RED, GREEN, BLUE, YELLOW;
}

// Main class with main() method
public class Main {
    public static void main(String[] args) {
        // Loop through all values in the enum and print them
        System.out.println("Available colors:");
        for (Color c : Color.values()) {
            System.out.println(c);
        }
    }
}