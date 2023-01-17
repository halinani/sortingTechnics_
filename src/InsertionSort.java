public class InsertionSort {
    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void insertionSort(){
//        out loop for the number to be sorted
        for(int i = 0;i < arr.length;i++){
            int currentNum = arr[i];
            int j = i;
            while(j > 0 && currentNum < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = currentNum;
        }
    }

    public void print(){
        for(int num : this.arr){
            System.out.print(num+" ");
        }
    }


}
