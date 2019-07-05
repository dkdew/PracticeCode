
/**
 * Created by Dinesh Dewangan on 21/05/19.
 */
public class MiddleElement {

    static ListNode head;
    public static void main(String ar[]){
        head = new ListNode(6);
        head = head.pushAtHead(head, 5);
        head = head.pushAtHead(head, 4);
        head = head.pushAtHead(head, 3);
        head = head.pushAtHead(head, 2);
        head = head.pushAtHead(head, 1);
        head = head.pushAtHead(head, 0);
        head.printList(head);
        findMiddleListNode(head);
    }

    public static ListNode findMiddleListNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle element is "+slow.data);
        return slow;
    }


}
