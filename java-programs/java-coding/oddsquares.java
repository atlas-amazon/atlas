import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SquareExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }

      
       List<Integer> squares = numbers.stream()
       .filter(n -> n%2!=0)
                .map(n -> n * n)
                .collect(Collectors.toList());
                  System.out.println("Squares:");
        squares.forEach(System.out::println);
    }
}