public class March15 {
    public static void main(String[] args) {
        int[] nums = {5,3,7,10,4};

        int result = Searches.linearSearch(nums,7);
        System.out.println(result);

        int[] vals = {11,12,13,14,15,16,17,18,19,20,21,22};
        int[] bruh = new int [1000000];
        for (int i = 0; i < 1000000; i++) {
            bruh[i] = 77;
        }
        bruh[654765] = 6;

        System.out.println(Searches.linearSearch(bruh,6));
        System.out.println(bruh[867223]);

    }
}
/*
public class Searches
{
   //-----------------------------------------------------------------
   //  Searches the array of integers for the target using
   //  a linear search. The index where the target was found is
   //  returned, or -1 if the target is not found.
   //-----------------------------------------------------------------
   public static int linearSearch (int[] numbers, int target)
   {
      for (int index = 0; index < numbers.length; index++)
         if (target == numbers[index])
            return index;
      return -1;
   }
   //-----------------------------------------------------------------
   //  Searches the array of integers for the target using
   //  a binary search. The index where the target was found is
   //  returned, or -1 if the target is not found.
   //  NOTE: The array must be sorted!
   //-----------------------------------------------------------------
   public static int binarySearch (int[] numbers, int target)
   {
      int low = 0, high = numbers.length-1, middle = (low + high) / 2;
      while (numbers[middle] != target && low <= high)
      {
         if (target < numbers[middle])
            high = middle - 1;
         else
            low = middle + 1;
         middle = (low + high) / 2;
      }
      if (numbers[middle] == target)
         return middle;
      else
         return -1;
   }
}
 */