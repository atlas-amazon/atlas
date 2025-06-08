import java.util.Scanner;
public class GreaterNumber{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = scanner.nextInt();
         System.out.print("Enter second number:");
        int b = scanner.nextInt();
        if (a>b){
            System.out.println(a + "is greater than" +b);
        }else if (b>a){
          System.out.println(b + "is greater than" +a);  
          }else{
              System.out.println("Both numbers are equal"); 
          }
          scanner.close();
        }
    }



/* Output:
Enter first number:45
Enter second number:35
45is greater than35

*/