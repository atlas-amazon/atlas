public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; 
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}