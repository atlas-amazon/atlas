public class LoginValidation {

    public static void main(String[] args) {
        // Stored (valid) username and password
        final String validUsername = "sushma";
        final String validPassword = "4567";

        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Validate credentials
        if (inputUsername.equals(validUsername) && inputPassword.equals(validPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}

// validating user name and paswird