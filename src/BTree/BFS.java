package BTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Dinesh Dewangan on 23/05/19.
 */
public class BFS {

    static Node root;

    public static void main(String ar[]){
     root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(3);
     root.left.left = new Node(4);
     root.left.right = new Node(5);
     root.right.left = new Node(6);
     root.right.right = new Node(7);
     printLevelOrder(root);
    }

    public static void printLevelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node.left!= null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
            System.out.println(node.data);
        }
    }


}
