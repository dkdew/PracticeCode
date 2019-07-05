
public class ListNode {

	public int data;
	public ListNode next;
	
	public ListNode(int data){
		this.data = data;
		next = null;
	}

	public void printList(ListNode head){
		ListNode current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}

	public ListNode pushAtHead(ListNode head, int data){
		ListNode newListNode = new ListNode(data);
		newListNode.next = head;
		head = newListNode;
		return head;
	}
}
