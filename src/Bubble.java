package sorting;

/**
 * Created by Dinesh Dewangan on 02/06/19.
 */
public class Bubble {

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
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1-i;j++){
             if(arr[j]>arr[j+1]){
                 swap(arr, j, j+1);
             }
            }
        }
    }

    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
