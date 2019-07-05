
public class LinkedList {

    ListNode head;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new ListNode(20);
        ll.pushAtHead(10);
        ll.insertAfter(ll.head.next, 30);
        ll.append(40);
        ll.insertAfter(ll.head.next.next.next, 50);
        ll.pushAtHead(5);
        ListNode current = ll.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        ll.findMiddleElement();
        System.out.println(ll.isCyclic());
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void pushAtHead(int data) {
        ListNode newListNode = new ListNode(data);
        newListNode.next = head;
        head = newListNode;
    }

    public void insertAfter(ListNode prevListNode, int data) {
        if (prevListNode == null) {
            return;
        }
        ListNode newListNode = new ListNode(data);
        newListNode.next = prevListNode.next;
        prevListNode.next = newListNode;
    }

    public void append(int data) {
        ListNode newListNode = new ListNode(data);
        ListNode current = head;
        if (current == null) {
            current = newListNode;
            head = current;
        } else {
            while (current.next != null) {
                current = current.next;
            }
        }
        current.next = newListNode;
    }

    public ListNode findMiddleElement() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle element is :" + slow.data);
        return slow;
    }

    public boolean isCyclic() {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
