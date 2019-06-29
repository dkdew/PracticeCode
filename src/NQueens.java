package array;

/**
 * Created by Dinesh Dewangan on 13/06/19.
 */
public class NQueens {

    int solution[][];
    int size;

    public NQueens(int size) {
        this.size = size;
        solution = new int[size][size];
    }

    public static void main(String arg[]) {
        NQueens nQueens = new NQueens(8);
        nQueens.placeQueens(nQueens.solution, 0);
        nQueens.printSolution();

    }

    public void placeQueens(int solution[][], int r) {
        if (r == size) {
            printSolution();
        }

        for (int c = 0; c < size; c++) {
            if (isSafeMove(solution, r, c)) {
                solution[r][c] = 1;
                placeQueens(solution, r + 1);
                solution[r][c] = 0;
            }
        }
    }


    boolean isSafeMove(int mat[][], int r, int c) {

        for (int i = 0; i < r; i++)
            if (mat[i][c] == 1)
                return false;


        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
            if (mat[i][j] == 1)
                return false;

        for (int i = r, j = c; i >= 0 && j < size; i--, j++)
            if (mat[i][j] == 1)
                return false;

        return true;
    }

    public void printSolution() {
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[0].length; j++) {
                System.out.print(solution[i][j]);
            }
            System.out.println("");
        }
    }
}
