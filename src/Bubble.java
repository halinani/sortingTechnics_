public class Bubble {

    private int[] arr;
    public Bubble(int[] arr) {
        this.arr = arr;
    }

    public int[] bubbleSort(){
        int n = this.arr.length;

        for(int i = 0;i < n-1 ;i++){
            for(int j = 0;j < n-1-i;j++){
                if(this.arr[j] > this.arr[j+1]){
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public void print() {

        for(int i = 0;i < arr.length;i++){
            System.out.print(this.arr[i] +" ");
        }

    }
}

