public class ReverseList {
    ListNode head;

    public static void main(String[] args) {
        ReverseList rl = new ReverseList();
        rl.head = new ListNode(10);
        rl.head.next = new ListNode(20);
        rl.head.next.next = new ListNode(30);
        rl.head.next.next.next = new ListNode(40);
        rl.head.next.next.next.next = new ListNode(50);
        rl.printList();
        rl.reverseRecursive(null, rl.head, null);
        System.out.println("after revers");
        rl.printList();
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void reverse() {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void reverseRecursive(ListNode prev, ListNode current, ListNode next) {
        if (current == null) {
            head = prev;
        }
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        reverseRecursive(prev, current, next);
    }
}
