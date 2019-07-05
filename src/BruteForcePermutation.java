/**
 * Created by Dinesh Dewangan on 03/07/19.
 */
public class BruteForcePermutation {
    static int n = 8;

    public static void main(String ar[]) {

        int arr[][] = new int[n][n];
        solveQueens(arr, n);
    }

    public static void solveQueens(int arr[][], int n) {
        place(arr, n, 0);
    }

    public static void place(int arr[][], int n, int c) {
        if (c >= n) {
            printSolution(arr);
            return;
        }



    }

    private static boolean isSafe(char mat[][], int r, int c) {
        // return false if two queens share the same column
        for (int i = 0; i < r; i++)
            if (mat[i][c] == 'Q')
                return false;

        // return false if two queens share the same \ diagonal
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
            if (mat[i][j] == 'Q')
                return false;

        // return false if two queens share the same / diagonal
        for (int i = r, j = c; i >= 0 && j < n; i--, j++)
            if (mat[i][j] == 'Q')
                return false;

        return true;
    }


    public static void printSolution(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}