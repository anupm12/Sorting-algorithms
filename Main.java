import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arr = {9,0,5,2,8,3};
        
        // BubbleSort
        // BubbleSort bs = new BubbleSort();
        // bs.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // SelectionSort
        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
