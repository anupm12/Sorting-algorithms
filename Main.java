import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        bubbleSort bs = new bubbleSort();
        int[] arr = {20,0,01,1,6,5,9,0,3};
        System.out.println(Arrays.toString(arr));
        bs.sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
