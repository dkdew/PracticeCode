package BTree;

/**
 * Created by Dinesh Dewangan on 23/05/19.
 */
public class Height {

    static Node root;
    public static void main(String ar[]){
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println(height(root, 0));
    }

    public  static int height(Node root, int count){
        if(root == null){
            return count;
        }
        count ++;
        return Math.max(height(root.left, count), height(root.right, count));
    }
}
