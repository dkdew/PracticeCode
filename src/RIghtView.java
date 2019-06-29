package BTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Dinesh Dewangan on 29/06/19.
 */
public class RIghtView {

    public static void main(String ar[]) {
        BTree.TreeNode node = new BTree.TreeNode(1);
        node.left = new BTree.TreeNode(2);
        node.right = new BTree.TreeNode(3);
        node.left.right = new BTree.TreeNode(4);
        node.right.right = new BTree.TreeNode(5);
        node.right.right.right = new BTree.TreeNode(6);
        System.out.print(rightSideView(node));
    }

    public static List<Integer> rightSideView(BTree.TreeNode root) {
        List<Integer> righView = new ArrayList<>();
        if (root == null) {
            return righView;
        }
        Queue<BTree.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                BTree.TreeNode current = queue.remove();
                if (i == size - 1) {
                    righView.add(current.data);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                if (current.left != null) {
                    queue.add(current.left);
                }

            }
        }

        return righView;
    }
}
