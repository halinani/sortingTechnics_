public class MergeSort {

    public void mergeSort(int[] arr, int lb,int ub){
        if(lb < ub){
            int mid = (lb+ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1, ub);
            merge(arr, lb, mid, ub );
        }
    }
    public void merge(int[] arr, int lb , int mid, int ub){
//    create the 2 arrays
        int i ,j,k;

        int n1 = mid-lb;
        int n2 = ub - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
//        break down the arrays for loop put the numbers in it
        for(i = 0;i < n1;i++){
            leftArr[i] = arr[i];
        }
        for(j = mid; j< n2;j++){
            rightArr[j] = arr[mid+1+j];
        }
//        put all the items back in the array


        i = 0;
        j = 0;
        k = lb;

        while(i < n1 && j < n2){
            if (leftArr[i] > rightArr[j]) {
                arr[k] = rightArr[j];
                j++;
            } else {
                arr[k] = leftArr[i];
                i++;
            }
            k++;
        }

        while(i< n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j< n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public void print(int[] arr){
        for(int number: arr){
            System.out.print(number+" ");
        }
        System.out.println();
    }
}
