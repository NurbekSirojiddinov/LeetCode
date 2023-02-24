package Alorithm_Univercity.algorithm;

class Kruscal {
    static int V = 6;
    static int[] parent = new int[V];
    static int INF = 0;

    // Find set of vertex i
    static int find(int i) {
        while (parent[i] != i)
            i = parent[i];
        return i;
    }

    // Does union of i and j. It returns
// false if i and j are already in same
// set.
    static void union1(int i, int j) {
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }

    // Finds MST using Kruskal's algorithm
    static void kruskalMST(int[][] cost) {
        int mincost = 0; // Cost of min MST.

        // Initialize sets of disjoint sets.
        for (int i = 0; i < V; i++)
            parent[i] = i;

        // Include minimum weight edges one by one
        int edge_count = 0;
        while (edge_count < V - 1) {
            int min = INF, a = -1, b = -1;
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (find(i) != find(j) && cost[i][j] < min) {
                        min = cost[i][j];
                        a = i;
                        b = j;
                    }
                }
            }
            union1(a, b);
            System.out.printf("Edge %d:(%d, %d) cost:%d \n",
                    edge_count++, a, b, min);
            mincost += min;
        }
        System.out.printf("\n Minimum cost= %d \n", mincost);
    }

    public static void main(String[] args) {
        int[][] cost = {
                {INF, 8, INF, INF, 5, INF},
                {8, INF, 12, INF, INF, 9},
                {INF, 12, INF, 8, INF, INF},
                {INF, INF, 8, INF, 11, 4},
                {5, INF, INF, 11, INF, 4},
                {INF, 9, INF, 4, 7, INF}
        };
        // Print the solution
        kruskalMST(cost);
    }
}