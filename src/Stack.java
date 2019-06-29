/**
 * Created by Dinesh Dewangan on 19/06/19.
 */
public class Stack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (top != null) {
            return top.data;
        } else {
            return -1;
        }
    }

    public int pop() {
        Node node = top;
        top = top.next;
        return node.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        if (top != null) {
            node.next = top;
        } else {
            top = node;
        }
    }

    public static void main(String ar[]) {
        Stack stack = new Stack();
        stack.push(5);
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
