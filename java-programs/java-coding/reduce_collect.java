import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReduceCollectExample {
    public static void main(String[] args) {
       
        int sum = IntStream.range(1, 11)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);

        
        List<Integer> numbers = IntStream.range(1, 11)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Numbers: " + numbers);
    }
}