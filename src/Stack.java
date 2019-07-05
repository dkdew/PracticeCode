/**
 * Created by Dinesh Dewangan on 19/06/19.
 */
public class Stack {

    ListNode top;

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
        ListNode ListNode = top;
        top = top.next;
        return ListNode.data;
    }

    public void push(int data) {
        ListNode ListNode = new ListNode(data);
        if (top != null) {
            ListNode.next = top;
        } else {
            top = ListNode;
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
