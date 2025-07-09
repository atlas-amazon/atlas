//Write a recursive function to search for an element in an array

public class RecursiveSearch {

    public static int recursiveSearch(int[] arr, int target, int index) {
        
        if (index >= arr.length) {
            return -1; 
        }

        if (arr[index] == target) {
            return index; 
        }

        return recursiveSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 2, 5};
        int target = 9;

        int result = recursiveSearch(arr, target, 0);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}