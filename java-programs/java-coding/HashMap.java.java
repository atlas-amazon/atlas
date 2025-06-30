import java.util.HashMap;
import java.util.Map;

public class Task012_DS_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Anitha", 101);
        hm.put("Kavitha", 101);
        hm.put("Meera", 103);

        for (Map.Entry<String, Integer> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
