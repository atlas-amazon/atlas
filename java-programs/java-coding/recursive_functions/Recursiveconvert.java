// Recursive method to convert decimal to binary
public class DecimalToBinary {

    
    public static void decimalToBinary(int number) {
       
        if (number == 0) {
            return;
        }

        decimalToBinary(number / 2);

        System.out.print(number % 2);
    }

    public static void main(String[] args) {
        int number = 19;

        if (number == 0) {
            System.out.print(0);
        } else {
            System.out.print("Binary of " + number + " is: ");
            decimalToBinary(number);
        }
    }
}