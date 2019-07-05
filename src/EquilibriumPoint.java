
public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {9,3,5,2,2};
		System.out.println(equilibriumPoint(data));
	}
	
	public static  int equilibriumPoint(int data[]){
		if(data.length < 3){
			return -1;
		}
		int n = data.length;
		int lsum = 0;
		int rsum = 0;
		for(int i = 2; i<n; i++){
			rsum = rsum + data[i];
		}
		
		for(int i = 1; i<n-1; i++){
			lsum = lsum + data[i-1];
			if(lsum == rsum){
				return i;
				}
			rsum = rsum - data[i+1];
			
		}
		return -1;
	}

}
