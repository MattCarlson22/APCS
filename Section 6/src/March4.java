public class March4 {
    public static void main(String[] args) {
        int[][] nums = new int [2][3];
        int[][] vals = {
                {3,5}, // vals index 0
                {7,8,9}, // vals index 1
                new int [5] // vals index 2
        };

        for (int[] x : nums) {
            for (int y : x) {
                System.out.print(y+"\t");
            }
            System.out.println();
        }

        System.out.println("----------");

        for (int[] x : vals) {
            for (int y : x) {
                System.out.print(y+"\t");
            }
            System.out.println();
        }

        System.out.println("----------");

        Dog[][] kennel = new Dog [2][2];
        Dog a = new Dog(0,"d0");
        a.feed();

        kennel[0][0] = a;
        kennel[0][0].feed();

        kennel[0][0].setName("fido");
        a.feed();

        kennel[0][0] = new Dog(1,"d1");
        a.feed();
    }
}
