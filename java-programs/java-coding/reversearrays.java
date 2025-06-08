import java.util.Arrays;
import java.util.Collections;
public class ReverseArraywithcollections{
    public static void main(String[]args){
        Integer[] arr ={10,20,30,40,50};
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}