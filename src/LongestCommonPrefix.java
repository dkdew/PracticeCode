/**
 * Created by Dinesh Dewangan on 29/06/19.
 */
public class LongestCommonPrefix {

    public static void main(String ar[]) {
        String arr[] = {"flower", "flow", "floZZSSM  wless"};
        String arr1[] = {"dog", "cat", "rat"};
        System.out.println(findLongestPrefix(arr));
    }

    public static String findLongestPrefix(String ar[]) {
        String prefix = "";
        if (ar == null || ar.length == 0) {
            return prefix;
        }
        int index = 0;
        for (char c : ar[0].toCharArray()) {
            for (int i = 1; i < ar.length; i++) {
                if (index >= ar[i].length() || c != ar[i].charAt(index)) {
                    return prefix;
                }
            }
            prefix = prefix + c;
            index++;
        }
        return prefix;
    }
}
