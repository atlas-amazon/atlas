import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));
        
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println("Reversed array: " + list);
    }
}