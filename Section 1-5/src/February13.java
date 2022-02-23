
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class February13 {

    public static int mult (int x1, int x2) {
        return x1 * x2;
    }
    public static void main(String[] args) {
        /*
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("arr1");
        arr.add("arr2");
        System.out.println(arr);
        
        for(String x: arr) {
            System.out.println(x);
        }

        */

        ArrayList<Integer> intArr = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++)
            intArr.add((int)(Math.random()*10)+1);

        System.out.println("Unsorted Array: "+intArr);
        Collections.sort(intArr);
        System.out.println("Sorted Array: "+intArr);

        Iterator<Integer> it = intArr.iterator();
        System.out.println(it.next());

        System.out.println(mult(2,2));


    }
}
