public class ReverseArrayInGroups {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : a)
            System.out.println(i);
        reverseInGroup(a, 3);
        System.out.println("after revese");
        for (int i : a)
            System.out.println(i);
    }

    public static void reverseInGroup(int data[], int k) {
        for (int i = 0; i < data.length; i = i + k) {
            swap(data, i, i + (k - 1));
        }
    }

    public static void swap(int a[], int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

}
