package linkedlist;

public class Intersection {
	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node headA = new Node(10);
		headA.next = new Node(20);
		headA.next.next = new Node(30);
		headA.next.next.next = new Node(40);
		headA.printList(headA);

		Node headB = new Node(5);
		headB.next = headA.next.next;
		headB.printList(headB);
		System.out.println("Intersection"+intersectPoint(headA, headB));

	}

	static int  intersectPoint(Node headA, Node headB)
	{
         int count1 = 0;
         Node temp = headA;
         while(temp != null){
             count1 ++;
             temp = temp.next;
         }
         System.out.println("headA count:"+count1);
         temp = headB;
         int count2 = 0;
         while(temp != null){
             count2++;
             temp = temp.next;
         }
         System.out.println("headB count:"+count2);
         int diff = 0;       
         if(count1> count2){
             diff = count1 - count2;
             return getIntersection(headA, headB, diff);
         }else{
         
             diff = count2 - count1;
             return getIntersection(headB, headA, diff);
         }       
      
	}
	public static int getIntersection(Node headA, Node headB, int diff){
		for(int i =0; i<diff; i++){
			headA = headA.next;
		}
		while(headA!= null){
			if(headA == headB){
				return headA.data;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return -1;
	}
}
