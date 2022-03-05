import java.util.ArrayList;
public class February28 {
    public static void main(String[] args) {
        ArrayList<Dog> kennel = new ArrayList<Dog>();

        kennel.add(new Dog(0,"d0"));
        kennel.add(new Dog(1,"d1"));
        kennel.add(new Dog(2,"d2"));
        System.out.println(kennel);

        for (Dog d : kennel) {
            System.out.println(d);
        }
        for (Dog d : kennel) {
            System.out.print(d.getID()+"\t");
        }
        System.out.println();

        kennel.add(1,new Dog(3,"d3"));

        for (Dog d : kennel) {
            System.out.print(d.getID()+"\t");
        }
        System.out.println();

        Dog d1 = kennel.remove(2);

        for (Dog d : kennel) {
            System.out.print(d.getID()+"\t");
        }
        System.out.println();

        Dog d2 = kennel.set(1,d1);

        for (Dog d : kennel) {
            System.out.print(d.getID()+"\t");
        }
        System.out.println();
    }
}
