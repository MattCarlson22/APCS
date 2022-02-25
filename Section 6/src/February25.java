import java.util.ArrayList;
public class February25 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(3);
        nums.add(1,7);
        nums.add(0,10);
        System.out.println(nums.size());
        System.out.println(nums);

        //int[] nums2 = {3,5};

        System.out.println("nums index 0: "+nums.get(0));

        int sum = 0;
        for (Integer i : nums)
            sum+=i;
        System.out.println("average of all values in nums: "+sum/(double)nums.size());

        ArrayList<Dog> kennel = new ArrayList<Dog>();

        Dog d0 = new Dog(0,"d0");

        kennel.add(d0);
        d0 = null;

        System.out.println(d0);
        d0 = kennel.get(0);
        System.out.println(d0);

        kennel.add(new Dog(1,"d1"));

        kennel.add(0,new Dog(2,"d2"));


    }
}
