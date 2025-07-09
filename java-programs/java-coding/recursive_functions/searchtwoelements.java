//Write a recursive function to search for two element in an array
public class RecursiveDoubleSearch {


    static class Result {
        int index1 = -1;
        int index2 = -1;
    }

    public static Result searchTwoElements(int[] arr, int target1, int target2, int index, Result result) {
       
        if (index >= arr.length) {
            return result;
        }

        if (arr[index] == target1 && result.index1 == -1) {
            result.index1 = index;
        }

        if (arr[index] == target2 && result.index2 == -1) {
            result.index2 = index;
        }

        if (result.index1 != -1 && result.index2 != -1) {
            return result;
        }

        return searchTwoElements(arr, target1, target2, index + 1, result);
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 2, 5};
        int target1 = 9;
        int target2 = 2;

        Result result = searchTwoElements(arr, target1, target2, 0, new Result());

        System.out.println("Index of " + target1 + ": " + result.index1);
        System.out.println("Index of " + target2 + ": " + result.index2);
    }
}