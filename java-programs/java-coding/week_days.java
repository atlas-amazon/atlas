import java.util.Scanner;
public class Weekdaychecker{
    private static final String[] weekdays={"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Saturday"};
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number(1 to 7):");
        int day = scanner.nextInt();
        if (day >=1 && day <= 7){
            System.out.println("Day" + day + "is" + weekdays[day- 1]);
        } else {
            System.out.println("Invalid input! please enter number 1 to 7");
        }
       scanner.close(); 
    }
}