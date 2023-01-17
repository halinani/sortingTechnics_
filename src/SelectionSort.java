public class SelectionSort {
    private int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }


    public void selectionSort(){
        for(int i = 0;i < arr.length;i++){
            int min= i;
            for(int j = i + 1;j < arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }




    }

    public void print(){
        for(int n : arr){
            System.out.print(" "+n);
        }
    }
}
