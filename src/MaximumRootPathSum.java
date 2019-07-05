
/**
 * Created by Dinesh Dewangan on 21/05/19.
 */
public class MaximumRootPathSum {

    public static void main(String ar[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(findMaxPathSum(root,0));
    }

    public static int findMaxPathSum(TreeNode node, int currentSum){
        if(node != null) {
            currentSum = currentSum + node.data;
            return Math.max(findMaxPathSum(node.left, currentSum), findMaxPathSum(node.right, currentSum));
        }else{
            return currentSum;
        }
    }
}
