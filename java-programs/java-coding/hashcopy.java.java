import java.util.HashMap;

public class MapCopyExample {
    public static void main(String[] args) {
        // Original map
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Apple");
        originalMap.put(2, "Banana");
        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.putAll(originalMap); 

        System.out.println("Copied map: " + newMap);
        
    }
}