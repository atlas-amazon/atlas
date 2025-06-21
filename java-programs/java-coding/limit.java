import java.util.stream.IntStream;

public class LoopExample {
    public static void main(String[] args) {
        IntStream.range(1, 11)
                .forEach(i -> System.out.println("Iteration: " + i));
        
        // Alternatively, using limit()
        IntStream.iterate(1, i -> i + 1)
                .limit(10)
                .forEach(i -> System.out.println("Iteration: " + i));
    }
}