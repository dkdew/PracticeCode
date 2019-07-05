/**
 * Created by Dinesh Dewangan on 2019-07-05.
 */
public class WordSearch {

    char[][] mat = {
            {'x', 'b', 'c'},
            {'a', 'b', 'a'},
            {'m', 'n', 't'}};

    public static void main(String ar[]) {
        WordSearch ws = new WordSearch();
        ws.checkWord(ws.mat, "xta");

    }

    public void checkWord(char mat[][], String word) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (word.charAt(0) == mat[i][j]) {
                    char t = mat[i][j];
                    mat[i][j] = '0';
                    if(isWordFound(mat, word, i, j, 1)){
                        System.out.println("value found");
                        return;
                    }else{
                        System.out.println("not found");
                    }
                    mat[i][j] = t;
                }
            }
        }
    }

    public boolean isWordFound(char[][] mat, String word, int i, int j, int n) {
        if (n == word.length()) {

            return true;
        }
        for (int r = i - 1; r <= i + 1; r++) {
            for (int c = j - 1; c <= j + 1; c++) {
                if (r >= 0 && r < 3 && c >= 0 && c < 3 && word.charAt(n) == mat[r][c]) {
                    char t = mat[r][c];
                    mat[r][c] = '0';
                    if(isWordFound(mat, word, r, c, n + 1)){
                        return true;
                    }
                    mat[r][c] = t;
                }
            }
        }
        return false;
    }

}
