public class QuickSort {
    public static int partition(int[] arr, int start, int end){
       int pivot = end;
       int i = start - 1;

       for(int j = start;j<=end;j++){
           if(arr[j] <= arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
           }
       }
       return i;
    }

    public static void quickSort(int[] arr, int start, int ub){
        if(start < ub){
            int loc = partition(arr, start, ub);
            quickSort(arr, start, loc-1);
            quickSort(arr, loc+1, ub);
        }
    }



    public static void print(int[] arr){
        for(int number : arr){
            System.out.print(number+" ");
        }
        System.out.println();
    }


}
