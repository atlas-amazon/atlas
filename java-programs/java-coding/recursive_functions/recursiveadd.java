//Write a recursive function to count the digits of a positive integer
public class SumOfDigits {

    public static int sumDigits(int number) {
       
        if (number == 0) {
            return 0;
        }

        return (number % 10) + sumDigits(number / 10);
    }

    public static void main(String[] args) {
        int number = 189765;

        int sum = sumDigits(number);

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}