public class Queue {

    ListNode start;
    ListNode end;

    public static void main(String ar[]){
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
    public void enqueue(int data){
        ListNode ListNode = new ListNode(data);
        if(isEmpty()){
            start = ListNode;
            end = ListNode;
        }
        else{
            end.next = ListNode;
            end = ListNode;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        ListNode ListNode = start;
        if(start.next != null) {
            start = start.next;
        }else{
            start = null;
        }
        return ListNode.data;
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
    public static class ListNode {
         int data;
         ListNode next;

        public ListNode(int data){
            this.data = data;
            next = null;
        }
    }

}
