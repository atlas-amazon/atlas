//Write a recursive function to reverse a null-terminated string
public class ReverseString {

    public static String reverse(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "laptop";

        String reversed = reverse(input);

        System.out.println("Reversed string: " + reversed);
    }
}
