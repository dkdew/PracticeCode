package heap;

/**
 * Created by Dinesh Dewangan on 01/06/19.
 */
public class MinHeapJava {

    int capacity;
    int size;
    int arr[];

    public MinHeapJava(int capacity) {
        this.capacity = capacity;
        size = 0;
        arr = new int[capacity];
    }

    public static void main(String ar[]) {
        MinHeapJava minHeap = new MinHeapJava(10);
        minHeap.insert(10);
        minHeap.insert(9);
        minHeap.insert(8);
        minHeap.insert(7);
        minHeap.insert(6);
        minHeap.insert(5);
        minHeap.insert(4);
        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(1);
        minHeap.printHeap();
        System.out.println("poll :"+minHeap.poll());
        minHeap.printHeap();
    }

    public void insert(int data) {
        arr[size] = data;
        size++;
        heapifyUp();
    }

    public void heapifyUp() {
        int lastIndex = size - 1;
        int parentIndex = parent(lastIndex);
        while (arr[lastIndex] < arr[parentIndex] ) {
            swap(lastIndex, parentIndex);
            lastIndex = parentIndex;
            parentIndex = parent(parentIndex);
        }
    }

    public int poll(){
        int data = arr[0];
        arr[0] = arr[size-1];
        size --;
        heapifyDown();
        return data;
    }

    public void heapifyDown(){
        int left = 1;
        int right = 2;
        int root = 0;
        while(arr[root] > arr[left] && arr[root] > arr[right]){
            int smaller = arr[left] > arr[right] ? right : left;
            swap(smaller, root);
            root = smaller;
            left = left(smaller);
            right = right(smaller);
        }
    }

    public void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int left(int i) {
        return (2 * i) + 1;
    }

    public int right(int i) {
        return (2 * i) + 2;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }



}
