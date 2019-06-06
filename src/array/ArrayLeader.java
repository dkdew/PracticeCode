package array;

public class ArrayLeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {16, 17, 4, 3, 5, 2};
		findArrayLeader(a);
	}
	
	public static void findArrayLeader(int a[]){
		int curLeader = 0;
		for(int i = a.length-1;i>=0; i--){
			if(i == a.length -1){
				System.out.println(a[i]);
				curLeader = a[i];
			}
			else if(a[i]>=curLeader){
				System.out.println(a[i]);
				curLeader = a[i];
			}
		}
	}

}
