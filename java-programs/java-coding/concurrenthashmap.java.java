import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("apple", 10);
        map.put("banana", 5);
        map.put("orange", 7);
        map.put("orange", 7);
        map.put("grapes", 2);
        System.out.println("Apple count: " + map.get("apple"));

    
         map.compute("banana", (key, val) -> (val == null) ? 1 : val + 1);

        
        System.out.println("Final Map: " + map);

       
        map.remove("7");

        //System.out.println("Map after removing '7': " + map);
    }
}