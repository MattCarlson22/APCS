public class January18 {
    public static void main(String[] args) {
        Dog d1 = new Dog(1,"d1");
        //System.out.println(d1);

        //int[] nums = new int[10];
        //char[] characters = new char[5];

        int[] nums = { 1 , 2, 3 };
        System.out.println(nums.length);

        Dog[] kennel = new Dog[5];
        System.out.println(kennel[0]);

        kennel[0] = d1;
        System.out.println(kennel[0]);
        kennel[0].setName("d1New");
        System.out.println("\n"+d1);

        kennel[1] = new Dog(2,"d2");
        kennel[2] = new Dog(3,"d3");
        kennel[3] = new Dog(4,"d4");
        kennel[4] = new Dog(5,"d5");

        for(Dog d: kennel)
            System.out.println("\n"+d);
    }
}
