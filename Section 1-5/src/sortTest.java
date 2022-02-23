
import java.util.Arrays;

public class sortTest {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4, 3 };
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        
        Arrays.sort(arr);
        System.out.println("\n"+Arrays.toString(arr));
    }   
}
