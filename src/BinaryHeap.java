public class BinaryHeap {
    private int[] arr;
    private int sizeOfheap;

    public BinaryHeap(int arrLength){
        this.arr = new int[arrLength + 1];
        sizeOfheap = 0;
        System.out.println("BInary Heap with "+ arrLength +" items has been created");
    }
    public boolean isEmpty(){
        return sizeOfheap <= 0;
    }
    public Integer getPeek(){
        if(isEmpty()){
            System.out.println("can't get peek because the list is empty");
            return null;
        }else{
            return arr[1];
        }
    }
    public int heapSize(){
        return sizeOfheap;
    }
    public void levelOrder(){
        if(isEmpty()){
            System.out.println("the list is empty");
        }else{
            for(int i=1;i<=sizeOfheap;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public void preOrder(int root){
        if(isEmpty()){
            System.out.println("the list is empty");
        }else{
            System.out.print(arr[root]+" ");
            preOrder(2*root);
            preOrder((2*root)+1);
        }
    }
    public void inOrder(int root){
        if (isEmpty()){
            System.out.println("The array is empty");
        }else{
            inOrder(2*root);
            System.out.print(arr[root] +" ");
            inOrder((2*root)+1);
        }
    }
    public void postOrder(int root){
        if(isEmpty()){
            System.out.println("the list is empty");
        }else{
            postOrder(2*root);
            postOrder((2*root) + 1);
            System.out.print(root+" ");
        }
    }
    public void heapifyBottomUp(int index, String heapType){

        if(index <= 1){
            return;
        }
        int parenetIndex = index /2;

        if(heapType == "Min"){
            if(arr[parenetIndex] > arr[index]){
                int temp = arr[parenetIndex];
                arr[parenetIndex] = arr[index];
                arr[index] = temp;
            }
        } else if (heapType=="Max") {
            if(arr[parenetIndex] < arr[index]){
                int temp = arr[parenetIndex];
                arr[parenetIndex] = arr[index];
                arr[index] = temp;
            }
        }
        heapifyBottomUp(parenetIndex, heapType);
    }
    public void insert(int value, String heapType){
        if(arr.length > sizeOfheap + 1){
            arr[sizeOfheap + 1] = value;
            sizeOfheap++;
            heapifyBottomUp(sizeOfheap, heapType);
            System.out.println(value+ " has been inserted");
        }else{
            System.out.println("the array is full");
        }
    }

    public void heapifyTopToBottom(int index, String heapType){
        int left = 2*index;
        int right = 2*index + 1;
        int swapChild = 0;

        if(sizeOfheap < left){
            return;
        }

        if(heapType.equals("Max")){
//        single child means left alone
            if(sizeOfheap == left){
                if(arr[index] < arr[left]){
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;

                }
                return;
            }else{
                if(arr[left] > arr[right]){
                    swapChild = left;
                }else{
                    swapChild = right;
                }
                if(arr[index] < arr[swapChild]){
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }


//        2 children
        } else if (heapType.equals("Min")) {
            if(sizeOfheap == left){
                if(arr[index] > arr[left]){
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;

                }
                return;
            }else{
                if(arr[left] < arr[right]){
                    swapChild = left;
                }else{
                    swapChild = right;
                }
                if(arr[index] > arr[swapChild]){
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }


    public Integer extract(String heapType){
        if(isEmpty()){
            return null;
        }else{
            int getNumber = getPeek();

            arr[1] = arr[sizeOfheap];
            heapifyTopToBottom(1,heapType);
            sizeOfheap--;
            return getNumber;

        }
    }
}
