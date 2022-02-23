
public class firstSort {
    public static void main(String[] args) {

         int arr[] = { 4, 3, 2, 1 };

         for (int i = 0; i < arr.length; i++) { // Outer Loop

             for (int j = i + 1; j < arr.length; j++) { // Inner Loop

                 int temp = 0;

                 if (arr[j] < arr[i]) {
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
                 
             } // Inner Loop

             System.out.print(arr[i] + " ");
         } // Outer Loop
    }
}
