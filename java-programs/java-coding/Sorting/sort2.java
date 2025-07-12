import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] strings = {"ab", "abc", "abcd", "abcde", "abcdef"};
        System.out.println("Original array:");
        printArray(strings);
        Arrays.sort(strings, (a, b) -> Integer.compare(b.length(), a.length()));
        System.out.println("Sorted array (longest to shortest):");
        printArray(strings);
    }
       public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}