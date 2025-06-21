import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SquareOddUniqueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }

        // Using Stream to filter odd numbers, calculate squares, and remove duplicates
        List<Integer> squaresOfOddsUnique = numbers.stream()
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .map(n -> n * n) // Calculate squares
                .distinct() // Remove duplicates
                .collect(Collectors.toList());

        // Print results
        System.out.println("Squares of odd numbers (unique):");
        squaresOfOddsUnique.forEach(System.out::println);
    }
}