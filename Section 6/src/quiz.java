import java.util.ArrayList;

public class quiz {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("fox");
        animals.add(0, "squirrel");
        animals.add("deer");
        animals.set(2, "groundhog");
        animals.add(1, "mouse");
        System.out.println(animals.get(2) + " and " + animals.get(3));

        ArrayList<Integer> oldList = new ArrayList();
        oldList.add(100);
        oldList.add(200);
        oldList.add(300);
        oldList.add(400);
        ArrayList<Integer> newList = new ArrayList();
        newList.add(oldList.remove(1));
        newList.add(oldList.get(2));
        System.out.println(newList);

        ArrayList<Double> conditionRating = new ArrayList<Double>();
        conditionRating.add(9.84);
        conditionRating.add(8.93);
        conditionRating.add(7.65);
        conditionRating.add(6.24);
        conditionRating.remove(2);
        conditionRating.set(2, 7.63);
        System.out.println(conditionRating);
    }
}
