package linkedlist;

public class AddTwoNumbers {

	Node l1;
	Node l2;
	public static void main(String[] args) {
		AddTwoNumbers atn = new AddTwoNumbers();
		atn.l1= new Node(1);
		atn.l1.next = new Node(2);
		atn.l1.next.next = new Node(3);
		atn.printList(atn.l1);
		atn.l2 = new Node(5);
		atn.l2.next = new Node(6);
		atn.l2.next.next = new Node(7);
		atn.printList(atn.l2);
		System.out.println("new list");
		atn.printList(atn.addTwoNumbers(atn.l1, atn.l2));

	}
	
	public void printList(Node head){
		Node current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	
    public Node addTwoNumbers(Node l1, Node l2) {
        int sum = 0;
        int carry = 0;
        int num = 0;
        Node head= null, current=null ;
        while(l1 != null || l2 != null){
        
        	sum = 0;
            if(l1 != null){
            	sum = sum+l1.data;
            }
            if(l2!= null ){
            	sum = sum + l2.data;
            }
            if(carry > 0){
            	sum = sum +carry;
            }
            if(sum>=10){
                carry = 1;
                num = sum%10;
            }else{
                num = sum;
                carry = 0;
            }
            if(head == null){
                head = new Node(num);
                current = head;
            }else{
                Node n = new Node(num);
                current.next = n;
                current = n;
            }
            
            if(l1 != null){l1 = l1.next;}
            
            
            if(l2 != null){l2 = l2.next;}
            
        }
        if(carry>0){
        	Node n = new Node(carry);
        	current.next = n;
        }
        return head;
    }

}

