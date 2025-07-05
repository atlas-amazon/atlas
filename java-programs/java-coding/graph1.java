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

        Set<Integer> vertices = new HashSet<>();

        System.out.println("Graph Edges:");

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            System.out.println(u + " - " + v);

            vertices.add(u);
            vertices.add(v);
        }

        System.out.println("\nVertices in the Graph: " + vertices);

        System.out.println("Number of Vertices: " + vertices.size());
        System.out.println("Number of Edges: " + edges.length);
    }
}