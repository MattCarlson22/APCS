
public class January6 {
    public static void main(String[] args) {
        int[] nums = {1 , 3 , 50};
        int x = nums[1];
        System.out.println(x+" before change");
        x = 5;
        System.out.println(nums[1]);
        System.out.println(x);

        changeNumber(x);
        System.out.println("x After changeNumber(x)\t"+x);

        changeNumber(nums[2]);
        System.out.println("x After changeNumber(x)\t"+nums[2]);

        changeArray(nums);
        System.out.println("\nnums in changeArray");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
    }
    public static void changeArray(int[] vals) {
        System.out.println("\nvals in changeArray");
        for(int i = 0; i < vals.length; i++) {
            System.out.print(vals[i]+"\t");
        }
        System.out.println();

        vals[0] = 100;
    }
    public static void changeNumber(int y) {
        y = 10;
        System.out.println("In method\t"+y);
    }
}

// Primitive data is passed by copy
// Objects are passed by reference