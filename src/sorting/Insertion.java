package sorting;

/**
 * Created by Dinesh Dewangan on 02/06/19.
 */
public class Insertion {


    public static void main(String ar[]){
        int arr [] = {5,3,7,1,2};
        System.out.println("before sorting");
        for(int i : arr){
            System.out.println(i);
        }
        insertionSort(arr);
        System.out.println("after sorting");
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void insertionSort(int arr[])
    {
        int n = arr.length;

        for (int i = 1; i < n; i++)
        {   System.out.println("Sort Pass Number "+(i));
            int key = arr[i];
            int j = i-1;

            while ( (j > -1) && ( arr [j] > key ) )
            {
                System.out.println("Comparing "+ key  + " and " + arr [j]);
                arr [j+1] = arr [j];
                j--;
            }
            arr[j+1] = key;
            System.out.println("Swapping Elements: New Array After Swap");
            printArray(arr);
        }
    }
    static void printArray(int[] array){

        for(int i=0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

}
