

public class IsBst {

	TreeNode root = null;

	public static void main(String[] args) {

		IsBst ib = new IsBst();
		ib.root = new TreeNode(10);
		ib.root.left = new TreeNode(7);
		ib.root.right = new TreeNode(5);
		ib.root.left.left = new TreeNode(4);
		ib.root.left.right = new TreeNode(8);

		ib.root.right.left = new TreeNode(12);
		System.out.println(ib.isBst(ib.root));

	}

	public boolean isBst(TreeNode root) {
		return isBstUtils(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isBstUtils(TreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.data < min || root.data > max) {
			return false;
		}
		return isBstUtils(root.left, min, root.data - 1) && isBstUtils(root.right, root.data + 1, max);

	}

}
