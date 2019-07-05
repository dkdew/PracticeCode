import java.util.Arrays;

/**
 * Created by Dinesh Dewangan on 04/07/19.
 */
public class ReverseVovel {

    public static void main(String ar[]){
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (isVovel(arr[i]) && isVovel(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (!isVovel(arr[i])) {
                i++;
            }
            if (!isVovel(arr[j])) {
                j--;
            }
        }
        return Arrays.toString(arr);
    }

    static boolean  isVovel(char c) {
        return (c == 'a' || c == 'A' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U' ||
                c == 'e' || c == 'E');
    }
}
