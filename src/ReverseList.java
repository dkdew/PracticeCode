package linkedlist;

public class ReverseList {
	Node head;
	public static void main(String[] args) {
		ReverseList rl = new ReverseList();
		rl.head = new Node(10);
		rl.head.next = new Node(20);
		rl.head.next.next = new Node (30);
		rl.head.next.next.next = new Node(40);
		rl.head.next.next.next.next = new Node(50);
		rl.printList();
		rl.reverseRecursive(null, rl.head, null);
		System.out.println("after revers");
		rl.printList();
	}

	public void printList(){
		Node current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void reverse(){
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current!= null){
			next = current.next;
			current.next = prev;
			prev = current ;
			current = next;
		}
		head = prev;
	}
	
	public void reverseRecursive(Node prev, Node current, Node next){
		if(current==null){
			head = prev;
		}
		next = current.next;
		current.next= prev;
		prev = current;
		current = next;
		reverseRecursive(prev, current, next);
	}
}
