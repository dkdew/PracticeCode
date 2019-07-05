
public class ZigZagOrder {

	public static void main(String[] args) {
		int arr[] = {4,3,7,8,6,2,1};
		for(int i : arr){
			System.out.println(i);
		}
		System.out.println("after zigzag");
		convertZigZag(arr);
		for(int i : arr){
			System.out.println(i);
		}
	}

	public static void convertZigZag(int arr[]) {
		boolean flag = true;
		for (int i = 0; i < arr.length-1; i++) {
			if(i%2 == 0){
				if(arr[i] > arr[i+1]){
					swap(arr, i , i+1 );
				}
			}else{
				if(arr[i+1] > arr[i]){
					swap(arr, i , i+1 );
				}
			}
		}
	}

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
