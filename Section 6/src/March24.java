import java.util.Arrays;
public class March24 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(3,"D3"),new Dog(5,"D5"),new Dog(1,"D1")};

        String a = "A";
        String b = "C";

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));

        System.out.println("dogs[0] compared to dogs[2]: "+dogs[0].compareTo(dogs[2]));
        System.out.println("dogs[2] compared to dogs[0]: "+dogs[2].compareTo(dogs[0]));

        System.out.println(Arrays.toString(dogs));
        Sorts.insertionSort(dogs);
        System.out.println(Arrays.toString(dogs));

    }
}
