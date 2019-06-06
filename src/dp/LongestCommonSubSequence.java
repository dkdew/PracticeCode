package dp;

/**
 * Created by Dinesh Dewangan on 18/05/19.
 */
public class LongestCommonSubSequence {

    public static void main(String[] ar){
        System.out.println(findLcs("acbdea","abcda"));
        System.out.println(findLcsRecursive("acbdea","abcda"));
    }

    public static int findLcsRecursive(String a, String b){
        if(a.length() == 0 || b.length() ==0){
            return 0;
        }
        int lenA = a.length();
        int lenB = b.length();
        if(a.charAt(lenA-1) == b.charAt(lenB-1)){
            return 1 + findLcsRecursive(a.substring(0, lenA-1), b.substring(0, lenB-1));
        }else{
            return Math.max(findLcsRecursive(a.substring(0, lenA-1), b.substring(0, lenB)),findLcsRecursive(a.substring(0, lenA), b.substring(0, lenB-1)));
        }
    }
    public static int findLcs(String a, String b){
        if(a.length() == 0 || b.length() ==0){
            return -1;
        }
        int lcs[][] = new int[a.length()+1][b.length()+1];
        for(int i = 0; i<=a.length(); i++){
            lcs[i][0] = 0;
        }
        for(int i =0; i<= b.length(); i++){
            lcs[0][i] = 0;
        }
        for(int i = 1; i<=a.length(); i++){
            for(int j = 1; j<=b.length(); j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    lcs[i][j] = lcs[i-1][j-1]+1;
                }else{
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }
        return lcs[a.length()][b.length()];
    }
}
