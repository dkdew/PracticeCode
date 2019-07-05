/**
 * Created by Dinesh Dewangan on 21/05/19.
 */
public class LeftView {

    static int max = 0;

    public static void main(String ar[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(5);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(6);
        node.right.left.right = new TreeNode(7);
        printLeftView(node, 1);
    }

    public static void printLeftView(TreeNode root, int level){
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
