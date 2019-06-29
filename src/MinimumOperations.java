package BTree;

/**
 * Created by Dinesh Dewangan on 27/06/19.
 */
public class MinimumOperations {

    public static void main(String ar[]) {

        System.out.print(minimumOperations(0, 9384));
    }

    public static int minimumOperations(int count, int n) {
        if (0 == n) {
            return count;
        }
        if (n > 1 && n % 2 == 0) {
            return minimumOperations(count + 1, n / 2);
        } else {
            return minimumOperations(count + 1, n - 1);
        }
    }
}
