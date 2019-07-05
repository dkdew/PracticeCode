
public class AddTwoNumbers {

	ListNode l1;
	ListNode l2;
	public static void main(String[] args) {
		AddTwoNumbers atn = new AddTwoNumbers();
		atn.l1= new ListNode(1);
		atn.l1.next = new ListNode(2);
		atn.l1.next.next = new ListNode(3);
		atn.printList(atn.l1);
		atn.l2 = new ListNode(5);
		atn.l2.next = new ListNode(6);
		atn.l2.next.next = new ListNode(7);
		atn.printList(atn.l2);
		System.out.println("new list");
		atn.printList(atn.addTwoNumbers(atn.l1, atn.l2));

	}
	
	public void printList(ListNode head){
		ListNode current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        int num = 0;
        ListNode head= null, current=null ;
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
                head = new ListNode(num);
                current = head;
            }else{
                ListNode n = new ListNode(num);
                current.next = n;
                current = n;
            }
            
            if(l1 != null){l1 = l1.next;}
            
            
            if(l2 != null){l2 = l2.next;}
            
        }
        if(carry>0){
        	ListNode n = new ListNode(carry);
        	current.next = n;
        }
        return head;
    }

}

