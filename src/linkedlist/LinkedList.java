package linkedlist;

public class LinkedList {
	
	Node head;
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.head = new Node(20);
		ll.pushAtHead(10);
		ll.insertAfter(ll.head.next,30);
		ll.append(40);
		ll.insertAfter(ll.head.next.next.next,50);
		ll.pushAtHead(5);
		Node current = ll.head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
		ll.findMiddleElement();
		System.out.println(ll.isCyclic());
	}
	
	public void printList(Node head){
		Node current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void pushAtHead( int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAfter(Node prevNode, int data){
		if(prevNode == null){
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	public void append(int data){
		Node newNode = new Node(data);
		Node current = head;
		if(current == null){
			current = newNode;
			head = current;
		}else{
		while(current.next != null){
			current = current.next;
		}
		}
		current.next = newNode;
	}
	
	public Node findMiddleElement(){
		Node slow = head;
		Node fast = head;
		while(fast.next!= null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("middle element is :"+slow.data);
		return slow;
	}
	
	public boolean isCyclic(){ 
		Node fast = head; 
		Node slow = head; 
		while(fast!= null && fast.next != null){ 
			fast = fast.next.next; 
			slow = slow.next; 
			if(fast == slow ){ 
				return true; 
				} 
			} 
		return false;
		}
	}
