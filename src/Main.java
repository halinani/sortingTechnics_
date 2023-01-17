public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{10,3,12,1,2};
        InsertionSort is = new InsertionSort(arr);

        is.print();
        System.out.println("from insertionSort");
        is.insertionSort();
        is.print();

    }
}