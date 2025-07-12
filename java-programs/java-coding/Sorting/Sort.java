import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] strings = {"sky", "water", "river", "sea", "ocean"};
        System.out.println("Original array:");
        printArray(strings);

        Arrays.sort(strings);
        System.out.println("Sorted array:");
        printArray(strings);
    }
       public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}