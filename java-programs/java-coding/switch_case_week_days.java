import java.util.Scanner;
public class weekdayswitch{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number(1 to 7):");
        int day = scanner.nextInt();
        String weekday;
        switch(day) {
            case 1->weekday = "Monday";
            case 2->weekday = "Tuesday";
            case 3->weekday = "Wednesday";
            case 4->weekday = "Thursday";
            case 5->weekday = "Friday";
            case 6->weekday = "Saturday";
            case 7->weekday = "Sunday";
            default -> weekday = "Invalid input, please enter 1 to 7";
        }
    System.out.println(weekday);
       scanner.close(); 
    }
}
