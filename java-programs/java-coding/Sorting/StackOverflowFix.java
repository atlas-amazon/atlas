public class StackOverflowFix {

    public static void recursiveCall(int count) {
        if (count == 0) {
            return;  
        }

        System.out.println("Recursion count: " + count);
        recursiveCall(count - 1);  
    }

    public static void main(String[] args) {
        recursiveCall(10);  
    }
}