public class SelectionSort {
    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIdx = i;
            for(int j = i; j < arr.length; j++){
                if(arr[minIdx] > arr[j])
                    minIdx = j;
            }
            this.swap(arr, i, minIdx);
        }
    }

    public void swap(int[] arr, int pos1, int pos2){
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }
}
