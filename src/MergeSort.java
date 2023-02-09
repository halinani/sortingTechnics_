public class MergeSort {

    public static void merge(int[] arr, int left, int mid, int right){
        int[] leftArr = new int[mid - left];
        int[] rightArr = new int[right-mid+1];

        int arrLength = arr.length;
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;

        for(int i = 0;i < leftSize;i++){
            leftArr[i] = arr[i];
        }

        for(int i = 0;i < rightSize-1;i++){
            rightArr[i] = arr[i+mid+1];
        }

        int j = 0;
        int i=0;
        int k = 0;


        while(i < leftSize && j < rightSize){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        if(i < leftSize){
            while(i < leftSize){
                arr[k] = leftArr[i];
                i++;
                k++;
            }
        }

        if(j < rightSize){
            while(j < rightSize){
                arr[k] = rightArr[j];
                k++;
                j++;
            }
        }
    }


    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left,mid, right);
        }

    }





    public static void print(int[] arr){
        for(int number : arr){
            System.out.print(number+" ");
        }
        System.out.println();
    }
}