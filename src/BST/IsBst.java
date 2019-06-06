package BST;

public class IsBst {

	Node root = null;

	public static void main(String[] args) {

		IsBst ib = new IsBst();
		ib.root = new Node(10);
		ib.root.left = new Node(7);
		ib.root.right = new Node(5);
		ib.root.left.left = new Node(4);
		ib.root.left.right = new Node(8);

		ib.root.right.left = new Node(12);
		System.out.println(ib.isBst(ib.root));

	}

	public boolean isBst(Node root) {
		return isBstUtils(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isBstUtils(Node root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.data < min || root.data > max) {
			return false;
		}
		return isBstUtils(root.left, min, root.data - 1) && isBstUtils(root.right, root.data + 1, max);

	}

}
