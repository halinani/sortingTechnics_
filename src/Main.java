public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{10,3,12,1,2};
        BucketSort bs = new BucketSort(arr);

        bs.print();
        bs.bucketSort();
        System.out.println();
        bs.print();

    }
}