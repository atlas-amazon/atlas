import java.util.HashSet;
import java.util.Set;

public class GraphEdges {

    public static void main(String[] args) {
        
        int[][] edges = {
            {1, 2},
            {1, 3},
            {1, 4},
            {2, 4},
            {2, 5},
            {3, 4},
            {3, 5},
            {4, 5}
        };

        int evenCount = 0;
        int oddCount = 0;

        Set<Integer> vertices = new HashSet<>();

        System.out.println("Graph Edges:");

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            System.out.println(u + " - " + v);

            vertices.add(u);
            vertices.add(v);

            int sum = u + v;
            if (sum % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

  
        System.out.println("\nVertices in the Graph: " + vertices);

        // Display edge counts
        System.out.println("Number of Even Edges: " + evenCount);
        System.out.println("Number of Odd Edges: " + oddCount);
    }
}