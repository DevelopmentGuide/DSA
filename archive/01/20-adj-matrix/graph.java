public class graph {
    int[][] matrix;

    graph(int size) {
        matrix = new int[size][size];
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
        matrix[dst][src] = 1;
    }

    public void removeEdge(int src, int dst) {
        matrix[src][dst] = 0;
        matrix[dst][src] = 0;
    }

    public boolean hasEdge(int src, int dst) {
        return matrix[src][dst] == 1;
    }

    public void print() {
        for (int src = 0; src < matrix.length; src++) {
            for (int dst = 0; dst < matrix[src].length; dst++) {
                System.out.print(matrix[src][dst] + " ");
            }
            System.out.println();
        }
    }
}
