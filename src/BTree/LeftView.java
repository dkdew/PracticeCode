package BTree;

/**
 * Created by Dinesh Dewangan on 21/05/19.
 */
public class LeftView {

    static int max = 0;

    public static void main(String ar[]){
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(5);
        node.right = new Node(3);
        node.right.left = new Node(6);
        node.right.left.right = new Node(7);
        printLeftView(node, 1);
    }

    public static void printLeftView(Node root, int level){
        if(root == null){
            return;
        }

        if(max < level){
            System.out.println(root.data);
            max = level;
        }
        level = level +1;
        if(root.left != null){
            printLeftView(root.left, level);
        }
        if(root.right != null){
            printLeftView(root.right, level);
        }
    }
}
