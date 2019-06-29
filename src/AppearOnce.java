package array;

/**
 * Created by Dinesh Dewangan on 27/06/19.
 */
public class AppearOnce {

    public static void main(String ar[]){
        int arr[] = {1,1,2,2,3,4,4,5,5,6,6};
        int arr1[]= {2,2,3,3,4,4,5};
        int arr2[] = {1,1,2,2,3,3,4,4,5};
        //printSingleElement(arr);
        printSingleElement(arr1);
        //printSingleElement(arr2);
    }

    public static void printSingleElement(int arr[]){
        if(arr.length<0){
            System.out.println("invalid input");
        }
        if(arr.length==1){
            System.out.println("invalid input");
        }
        for(int i = 0; i<arr.length; i++){
            if(i==0 ){
                if(arr[i] != arr[i+1]){
                System.out.println(arr[i]);
                }
            }else if(i == arr.length-1)
            {
                if(  arr[i] != arr[i-1]){
                    System.out.println(arr[i]);
                }
            }else if (arr[i]!= arr[i-1] && arr[i]!= arr[i+1])
            {
                    System.out.println(arr[i]);
                }
            }
    }
}
