package recursion;

public class StackUsingArray {

	int size;
	int data[];
	int top;

	public StackUsingArray(int size) {
		this.size = size;
		data = new int[size];
		top = -1;
	}
	
	public void push(int val){
		if(top == size - 1){
			System.out.println("StackLinkedList overflow");
			return;
		}
		top++;
		data[top] = val;
	}
	
	public int pop(){
		if(top == -1){
			
		}
		return top;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
