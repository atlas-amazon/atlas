public class RecursiveSearch {

    // Recursive function to search for an element in the array
    public static int search(int[] arr, int target, int index) {
       
        if (index >= arr.length) {
            return -1;
        }

        
        if (arr[index] == target) {
            return index;
        }

        
        return search(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11, 13};
        int target = 9;

        int result = search(array, target, 0);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}