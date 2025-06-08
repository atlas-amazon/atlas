//task 010
//Wap to check greater of 3 numbers 

import java.util.Scanner;
public class GreaterNumber{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = scanner.nextInt();
         System.out.print("Enter second number:");
        int b = scanner.nextInt();
        System.out.print("Enter third number:");
        int c = scanner.nextInt();
        if (a>=b && a>=c){
            System.out.println(a + "is the greatest");
        }else if (b>=a && b>=c){
          System.out.println(b + "is the greatest");  
          }else{
              System.out.println(c + "is the greatest"); 
          }
          scanner.close();
        }
    }


/* Output:
Enter first number:8
Enter second number:9
Enter third number:4
9is the greatest
*/
