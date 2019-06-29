package linkedlist;

/**
 * Created by Dinesh Dewangan on 15/06/19.
 */
public class PivotPartition {

    static Node head;
    public static void main(String ar[]) {
         head = new Node(3);
        head = head.pushAtHead(head,8);
        head = head.pushAtHead(head, 1);
        head = head.pushAtHead(head, 0);
        head = head.pushAtHead(head, 5);
        head.printList(head);
        head = partition(head, 3);
        System.out.println("after parttion :");
        head.printList(head);
    }

    public static  Node partition(Node head, int pivot) {
        if (head == null) {
            return head;
        }
        Node smallHead = null;
        Node smallLast = null;
        Node equalHead = null;
        Node equalLast = null;
        Node greaterHead = null;
        Node greaterLast = null;

        while (head != null) {
            if (head.data < pivot) {
                if (smallHead == null) {
                    smallHead = head;
                    smallLast = head;
                } else {
                    smallLast.next = head;
                    smallLast = head;
                }
            } else if (head.data == pivot) {
                if (equalHead == null) {
                    equalHead = head;
                    equalLast = head;
                } else {
                    equalLast.next = head;
                    equalLast = head;
                }
            } else {
                if (greaterHead == null) {
                    greaterHead = head;
                    greaterLast = head;
                } else {
                    greaterLast.next = head;
                    greaterLast = head;
                }
            }
            head = head.next;
        }
        if (smallHead != null) {
            head = smallHead;
        }
        if (equalHead != null) {
            smallLast.next = equalHead;
        }
        if (greaterHead != null) {
            equalLast.next = greaterHead;
            greaterLast.next = null;
        }
        return smallHead;
    }
}

