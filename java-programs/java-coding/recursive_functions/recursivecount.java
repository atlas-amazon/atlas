//Write a recursive function to count the digits of a positive integer
public class DigitCounter {

    
    public static int countDigits(int number) {
    
        if (number < 10) {
            return 1;
        }

        return 1 + countDigits(number / 10);
    }

    public static void main(String[] args) {
        int number = 189765;

        int digitCount = countDigits(number);

        System.out.println("Number of digits in " + number + ": " + digitCount);
    }
}