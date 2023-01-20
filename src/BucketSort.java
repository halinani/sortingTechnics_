import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {
    private int[] arr;

    public BucketSort(int[] arr) {
        this.arr = arr;
    }


    public void bucketSort(){
//        get numbers max and number of buckets
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = arr[0];
        for(int n : arr){
            if(n > maxValue){
                maxValue = n;
            }
        }
//        put elements in the right bucket
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for(int i = 0;i < buckets.length;i++){
            buckets[i] = new ArrayList<Integer>();
        }
//insert
        for(int value: arr){
            int getBucket = (int) Math.ceil(((float)value * numberOfBuckets)/ (float)maxValue);
            buckets[getBucket - 1].add(value);
        }
//sort
        for(ArrayList<Integer> bucket: buckets){
            Collections.sort(bucket);
        }
//        add in the main function
        int index = 0;

        for(ArrayList<Integer> bucket: buckets){
            for(int number : bucket){
                arr[index] = number;
                index++;
            }

        }

    }

    public void print(){
        for(int n: this.arr){
            System.out.print(n+" ");
        }
    }





}
