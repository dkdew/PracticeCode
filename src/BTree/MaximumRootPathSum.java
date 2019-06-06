package BTree;

/**
 * Created by Dinesh Dewangan on 21/05/19.
 */
public class MaximumRootPathSum {

    public static void main(String ar[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(findMaxPathSum(root,0));
    }

    public static int findMaxPathSum(Node node, int currentSum){
        if(node != null) {
            currentSum = currentSum + node.data;
            return Math.max(findMaxPathSum(node.left, currentSum), findMaxPathSum(node.right, currentSum));
        }else{
            return currentSum;
        }
    }
}
