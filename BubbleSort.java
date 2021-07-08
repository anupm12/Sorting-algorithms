public class BubbleSort {
    public void sort(int[] arr){
        boolean isSorted = true;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    isSorted = false;
                    swap(arr, j-1, j);
                }
            }
            if(isSorted)
                return;
        }
    }

    public void swap(int[] arr, int pos1, int pos2){
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }
}
