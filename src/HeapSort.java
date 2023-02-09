public class HeapSort {

    private int[] arr;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }


    public void sort(){
        BinaryHeap heap = new BinaryHeap(arr.length);
        for(int i = 0; i < arr.length; i++){
            heap.insert(this.arr[i], "Min");
        }

        for(int i =0;i < this.arr.length;i++){
           this.arr[i] = heap.extract("Min");
        }
    }




    public void print(){
        for(int number : this.arr){
            System.out.print(number+" ");
        }
        System.out.println();
    }



}
