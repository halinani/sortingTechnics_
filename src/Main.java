public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{10,3,12,1,2};
        int lb = 0;
        int ub = arr.length-1;

        MergeSort ms = new MergeSort();
        ms.print(arr);
        ms.mergeSort(arr, lb, ub);
        ms.print(arr);
    }
}