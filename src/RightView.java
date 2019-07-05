
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Dinesh Dewangan on 29/06/19.
 */
public class RightView {

    public static void main(String ar[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.right = new TreeNode(5);
        node.right.right.right = new TreeNode(6);
        System.out.print(rightSideView(node));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> righView = new ArrayList<>();
        if (root == null) {
            return righView;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
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
