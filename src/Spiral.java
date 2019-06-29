package BTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Dinesh Dewangan on 23/05/19.
 */
public class Spiral {

    static TreeNode root;
    static Queue<TreeNode> queue ;

    public static void main(String ar[]){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        queue = new LinkedList<>();
        int height = Height.height(root, 0);
        printSpiral(root, height);
    }

    public static void printSpiral(TreeNode root, int height){
        boolean flag = false;
        for(int i = 0 ;i<height; i++){
            printHelper(root, i, 0, !flag);
        }
    }

    public static void printHelper(TreeNode root, int height, int level, boolean flag){
        if(root == null){
            return;
        }
        if(height == level){
            System.out.println(root.data);
        }

    }

    public static void printLevelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
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
