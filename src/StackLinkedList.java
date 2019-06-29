package stack;

/**
 * Created by Dinesh Dewangan on 01/06/19.
 */
public class StackLinkedList {

    Node top;

    public static void main(String ar[]){
        StackLinkedList o = new StackLinkedList();
        o.push(5);
        o.push(4);
        o.push(3);
        while(!o.isEmpty()){
            System.out.println(o.pop());
        }
    }
    public void push(int data){
        Node node = new Node(data);
        if(top != null){
            node.next = top;
        }
        top = node;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        Node node = top;
        top = top.next;
        return node.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int top(){
        if(top==null){
            return -1;
        }
        return top.data;
    }

    static class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
}
