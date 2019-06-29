package BTree;

/**
 * Created by Dinesh Dewangan on 23/05/19.
 */
public class Height {

    static TreeNode root;
    public static void main(String ar[]){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        System.out.println(height(root, 0));
    }

    public  static int height(TreeNode root, int count){
        if(root == null){
            return count;
        }
        count ++;
        return Math.max(height(root.left, count), height(root.right, count));
    }
}
