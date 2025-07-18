public class HeapSort {
    public static void heapSort(int[] arr) {
        buildMaxHeap(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i - 1);
        }
    }

    public static void buildMaxHeap(int[] arr) {
        for (int i = arr.length / 2; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }
    }

    public static void heapify(int[] arr, int i, int heapSize) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left <= heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right <= heapSize && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, heapSize);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 6, 5, 1, 8, 3, 7};
        System.out.println("Original array:");
        printArray(arr);
        heapSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}