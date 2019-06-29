/**
 * Created by Dinesh Dewangan on 14/06/19.
 */
public class RunTime {

    public static void main(String ar[]) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
