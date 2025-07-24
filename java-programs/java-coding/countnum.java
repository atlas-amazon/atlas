import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int count = String.valueOf(Math.abs(number)).length();
        System.out.println("The number has " + count + " digits.");
    }
}