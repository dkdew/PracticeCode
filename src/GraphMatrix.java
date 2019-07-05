

/**
 * Created by Dinesh Dewangan on 06/06/19.
 */
public class GraphMatrix {

    int size;
    int matrix[][];

    GraphMatrix(int size) {
        this.size = size;
        matrix = new int[size][size];
    }

    public void initialize() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public void printGraph() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public void addEdges(int source, int dest) {
        matrix[source][dest] = 1;
        matrix[dest][source] = 1;
    }

    public static void main(String args[]) {
        GraphMatrix graph = new GraphMatrix(5);
        graph.initialize();
        graph.addEdges(0, 1);
        graph.addEdges(0, 3);
        graph.addEdges(1, 2);
        graph.addEdges(2, 4);
        graph.addEdges(3, 4);
        graph.printGraph();

    }

}
