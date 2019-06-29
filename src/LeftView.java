package BTree;

/**
 * Created by Dinesh Dewangan on 21/05/19.
 */
public class LeftView {

    static int max = 0;

    public static void main(String ar[]){
        BTree.TreeNode node = new BTree.TreeNode(1);
        node.left = new BTree.TreeNode(2);
        node.left.left = new BTree.TreeNode(5);
        node.right = new BTree.TreeNode(3);
        node.right.left = new BTree.TreeNode(6);
        node.right.left.right = new BTree.TreeNode(7);
        printLeftView(node, 1);
    }

    public static void printLeftView(BTree.TreeNode root, int level){
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
