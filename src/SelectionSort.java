

/**
 * Created by Dinesh Dewangan on 02/06/19.
 */
public class SelectionSort {

    public static void main(String ar[]){
        int arr [] = {5,3,7,1,2};
        System.out.println("before sorting");
        for(int i : arr){
            System.out.println(i);
        }
        sort(arr);
        System.out.println("after sorting");
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void sort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int pos = i ;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[pos]){
                    pos = j;
                }
            }
            swap(arr, i, pos);
        }
    }

    public static void swap(int arr[], int i, int pos){
        int temp = arr[i];
        arr[i] = arr[pos];
        arr[pos] = temp;
    }
}
