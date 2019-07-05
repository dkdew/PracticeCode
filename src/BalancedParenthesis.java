
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		System.out.println(isBalanced("{()}{}"));

	}

	public static boolean isBalanced(String str) {

		Stack<Character> stackLinkedList = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (c == '{' || c == '[' || c == '(') {
				stackLinkedList.push(c);
			} else {
				if (stackLinkedList.empty() ||(c == '}' && stackLinkedList.pop() != '{') || (c == ']' && stackLinkedList.pop() != '[')
						|| (c == ')' && stackLinkedList.pop() != '(')) {
					return false;
				}
			}
		}

		return stackLinkedList.isEmpty();
	}

}
