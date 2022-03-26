import java.util.Arrays;

public class APCS_7_1 {
    public static void revSelectionSort(int[] numbers) {
        int max, temp;
        for (int i = 0; i < numbers.length-1; i++) {
            max = i;
            for (int scan = i + 1; scan < numbers.length; scan++) {
                if (numbers[scan] > numbers[max]) {
                    max = scan;
                }
            }
            temp = numbers[max];
            numbers[max] = numbers[i];
            numbers[i] = temp;
        }
    }
    public static void revInsertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int pos = i;
            while (pos > 0 && numbers[pos-1] < key) {
                numbers[pos] = numbers[pos-1];
                pos--;
            }
            numbers[pos] = key;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,5,2,5,2,8,3,5,9,0};
        int[] nums2 = {1,5,2,5,2,8,3,5,9,0};
        System.out.println("Original Array: "+Arrays.toString(nums));

        // reverse selection sort
        APCS_7_1.revSelectionSort(nums);
        System.out.println("Reverse Selection Sort: "+Arrays.toString(nums));

        // reverse insertion sort
        APCS_7_1.revInsertionSort(nums2);
        System.out.println("Reverse Insertion Sort: "+Arrays.toString(nums2));
    }
}
