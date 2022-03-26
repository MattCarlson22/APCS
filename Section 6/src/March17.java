public class March17 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(0,"d0"), new Dog(1,"d1"), new Dog(2,"d2")};
        System.out.println(dogs[0].equals("d0"));
        System.out.println(dogs[0].equals(0));
        System.out.println(dogs[1].equals(dogs[0]));

    }
}
