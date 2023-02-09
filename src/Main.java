public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{10,3,121,165,18,51,8716,846,1,16,487,16,18,71,1,};

        HeapSort heap = new HeapSort(arr);
        heap.print();
        heap.sort();
        heap.print();


    }
}