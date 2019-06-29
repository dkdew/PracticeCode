package queue;

public class Queue {

    Node start;
    Node end;

    public static void main(String ar[]){
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
    public void enqueue(int data){
        Node node = new Node(data);
        if(isEmpty()){
            start = node;
            end = node;
        }
        else{
            end.next = node;
            end = node;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        Node node = start;
        if(start.next != null) {
            start = start.next;
        }else{
            start = null;
        }
        return node.data;
    }

    public int top(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return start.data;
    }

    public boolean isEmpty(){
        return (start == null || end == null);
    }
    public static class Node {
         int data;
         Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

}
