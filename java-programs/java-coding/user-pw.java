import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username:");
        String username = scanner.nextLine();
          System.out.print("Enter your Id:");
          String Id = scanner.nextLine();
          scanner.nextLine();
          System.out.print("Enter your password:");
          String password = scanner.nextLine();
        System.out.println("\n--- User Information---");
        System.out.println("Username:" + username);
        System.out.println("Id:"+Id);
        System.out.println("Password:" + password);
        scanner.close();
    }
    
}    
 

/*Output:
Enter your username:Sushma
Enter your Id:mainamps@amazon.com

Enter your password:******

--- User Information---
Username:Sushma
Id:mainamps@amazon.com
Password:** */