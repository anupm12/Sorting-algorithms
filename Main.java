import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        BubbleSort bs = new BubbleSort();
        int[] arr = {20,0,1,6,5,9,0,3};
        bs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
