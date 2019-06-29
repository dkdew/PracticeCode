package graph;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Dinesh Dewangan on 06/06/19.
 */
public class GraphList {

    private int size;
    private LinkedList<Integer> list[];


    GraphList(int size) {
        this.size = size;
        list = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void printGraph() {
        for (int i = 0; i < size; i++) {
            System.out.print("vertex " + i + " is connected to :");
            for (int j = 0; j < list[i].size(); j++) {
                System.out.print(" " + list[i].get(j));
            }
            System.out.println("");
        }
    }

    public void addEdges(int source, int dest) {
        list[source].addFirst(dest);
        list[dest].addFirst(source);
    }

    public void traverseBfs(int item) {
        boolean[] visited = new boolean[size];
        Queue<Integer> queue = new LinkedList<>();
        visited[item] = true;
        queue.add(item);
        while (queue.size() != 0) {
            item = queue.poll();
            System.out.println(item);
            Iterator<Integer> iterator = list[item].listIterator();
            while (iterator.hasNext()) {
                int i = iterator.next();
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }


    public static void main(String ar[]) {
        GraphList graph = new GraphList(3);
        graph.addEdges(0, 1);
        graph.addEdges(0, 2);
        graph.addEdges(1, 2);

        //graph.printGraph();
        graph.traverseBfs(1);
        System.out.print("==========");
        //graph.BFS(1);
    }


}
