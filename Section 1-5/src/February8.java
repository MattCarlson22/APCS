

class testObject {

    private String name;
    private int id;
    private static int idCounter = 0;

    public testObject(int i, String n) {
        name = n;
        id = i;
    }
    public testObject() {
        name = "name";
        id = idCounter;
        idCounter++;
    }
    public void changeName(String n) {
        name = n;
    }
    public void changeID(int i) {
        id = i;
    }
    public void wave() {
        System.out.println("The object with the name "+name+" and ID "+id+" waved!");
    }
    public String toString() {
        String str = "";
        str += "Name: "+name+"\nID: "+id;
        return str;
    }

}

public class February8 {
    public static void main(String[] args) {

        testObject [] objects = new testObject [10];

        for (int i = 0; i < 10; i++) {
            objects[i] = new testObject();
            System.out.println(objects[i]+"\n");
        }

        objects[1].changeName("newName");
        objects[1].changeID(99);
        
        objects[1].wave();
        System.out.println();
        objects[2].wave();


    }

}
