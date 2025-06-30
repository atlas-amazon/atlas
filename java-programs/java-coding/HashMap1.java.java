import java.util.HashMap;

public class HashMapCapacityExample {
    public static void main(String[] args) {
      
        HashMap<Integer, String> map = new HashMap<>(10);

        // Add some key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

      
        System.out.println("HashMap contents:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        
        System.out.println("Current size: " + map.size());
    }
}