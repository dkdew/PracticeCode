package linkedlist;

public class Node {

	public int data;
	public Node next;
	
	public Node(int data){
		this.data = data;
		next = null;
	}

	public void printList(Node head){
		Node current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}

	public Node pushAtHead(Node head, int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return head;
	}
}
