package leetcode.graph;

public class QuickUnionFind {
    int[] root;

    public QuickUnionFind(int size) {
        root = new int[size];

        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    int find(int x) throws Exception {
        if (x < root.length) return root[x];
        throw new Exception("Such vertex doesn't exist!");
    }

    void union(int a, int b) throws Exception {
        int rootX = find(a);
        int rootY = find(b);

        if (rootX != rootY) {
            for (int i = 0; i < root.length; i++) {
                if (root[i] == rootX) {
                    root[i] = rootY;
                }
            }
        }
    }

    boolean connected(int a, int b) throws Exception {
        return find(a) == find(b);
    }

    public static void main(String[] args) throws Exception {
        QuickUnionFind uf = new QuickUnionFind(10);
        uf.union(1, 2);
        uf.union(2, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(3, 8);
        uf.union(8, 9);
        System.out.println(uf.connected(1, 5)); // true
        System.out.println(uf.connected(5, 7)); // true
        System.out.println(uf.connected(4, 9)); // false
    }
}
