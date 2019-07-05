
import java.util.Stack;

public class Palindrome {

	ListNode head;
	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		p.head = new ListNode(2);
		int[] list = { 3, 1, 4, 1, 2, 3, 5, 2, 3, 3, 1, 5, 4, 2, 1, 2, 3, 2, 2, 4, 3, 5, 3, 1, 3, 4, 3, 1, 5, 3, 3, 4, 5 };
		System.out.println(list.length);
		for(Integer i : list){
			ListNode ListNode = new ListNode(i);
			p.addToTheLast(p.head, ListNode);
		}
		p.printList(p.head);
		System.out.print(p.isPalindrom(p.head));
	}
	public void printList(ListNode head){
		ListNode current = head;
		while(current != null){
			System.out.print(current.data);
			current = current.next;
		}
	}
	
	  public void addToTheLast(ListNode head, ListNode ListNode) 
		{
			if (head == null) 
			{
				head = ListNode;
			} else 
			{
			   ListNode temp = head;
			   while (temp.next != null)
			   temp = temp.next;
			   temp.next = ListNode;
			}
	    }
	
	
	public boolean isPalindrom(ListNode head){
		Stack<Integer> stack = new Stack<Integer>();
		ListNode current = head;
		while(current!= null){
			stack.push(current.data);
			current = current.next;
		}
		current = head;
		while(current != null){
			if(current.data != stack.pop()){
				return false;
			}
			current = current.next;
		}
		return true;
	}

}
