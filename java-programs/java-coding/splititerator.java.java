import java.util.*;
public class SplitIteraror01 {
    public static void main(String[] args)     {


        LinkedList<String> l = new LinkedList<>();


        l.add("Sushma");
        l.add("Mainampati");
        l.add("SM");
       
        System.out.println(l);
       
        Spliterator<String> it = l.spliterator();


        System.out.println("Splitting the list:");
        it.forEachRemaining(System.out::println);
    }
}