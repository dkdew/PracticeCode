package array;

/**
 * Created by Dinesh Dewangan on 15/06/19.
 */
public class PartitionPoint {

    public static void main(String ar[]) {
        int arr[] = {5, 0, 3, 8, 6};
        System.out.println("index is" + partitionIndex(arr));
    }

    private static int partitionIndex(int arr[]) {

        int maxLeft[] = new int[arr.length];
        int max = arr[0];
        maxLeft[0] = max;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            maxLeft[i] = max;
        }

        int minRight[] = new int[arr.length];
        int min = arr[arr.length - 1];
        minRight[arr.length - 1] = min;
        for (int i = arr.length - 1; i >= 0; i--) {
            min = Math.min(min, arr[i]);
            minRight[i] = min;
        }

        int index = -1;
        for (int i = 1; i < arr.length; i++) {
            if (maxLeft[i - 1] > minRight[i]) {
                index = i;
            } else {
                return index;
            }
        }
        return -1;
    }
}
