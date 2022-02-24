public class February17 {
    public static void main(String[] args) {

        // Single dimension array
        int[] values = new int [3];
        values[1] = 15;
        System.out.println("values[1] >> "+values[1]);
        values[1]++;
        System.out.println("values[1] >> "+values[1]);

        // Single dimension for loop
        for (int i = 0; i < values.length; i++)
            System.out.print(values[i]+"\t");
        System.out.println();

        // 2D array
        int[][] nums = new int [3][5];
        nums[1][2] = 15;
        nums[2][4] = 25;
        System.out.println("nums[2][4] >> "+nums[2][4]);
        nums[2][4]++;
        System.out.println("nums[2][4] >> "+nums[2][4]);
        System.out.println("nums.length >> "+nums.length);
        System.out.println("nums[0].length >> "+nums[0].length);

        // 2D for loop
        System.out.println();
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++)
                System.out.print(num[j] + "\t");
            System.out.println();
        }

        /*
        int[] random = {5,7,9};
        int[][] vals = {
                        {3,5,7},
                        {10,11,12,13,14}
                        };
        */

        //Dog dogs[][] = new Dog[3][5];

    }
}