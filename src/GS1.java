import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dinesh Dewangan on 30/06/19.
 */
public class GS1 {

    static int loopCount = 0;
    static int recCount = 0;

    public static void main(String ar[]) {
        loop();
        System.out.println("after loop");
        List<Integer> list = new ArrayList<>();
        rec(list, 4, 0);
        System.out.println("loopCount: " + loopCount + " recCount: " + recCount);
    }

    public static void loop() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        System.out.println(i + " " + j + " " + k + " " + l);
                        loopCount++;
                    }
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }

    public static void rec(List arr, int n, int count) {
        if (count >= n) {
            System.out.println(arr);
            recCount++;
            return;
        }
        for (int i = 0; i < 3; i++) {
            arr.add(i);
            rec(arr, n, count + 1);
            int size = arr.size();
            arr.remove(size - 1);
        }
    }

}