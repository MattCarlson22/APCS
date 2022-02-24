class testObject {
    private String name;
    private int ID;
    public testObject(String n, int i) {
        ID = i;
        name = n;
    }
    public testObject() {
        ID = 0;
        name = "name";
    }
    public String toString() {
        return "name: "+name+"\nID: "+ID;
    }
    public void setID(int i) {
        ID = i;
    }
}
public class ObjectTesting {
    public static void main(String[] args) {

        testObject o1 = new testObject("bruh",99);
        System.out.println(o1+"\n");

        int idCounter = 0;
        testObject[] objArr = new testObject[5];
        for (testObject i: objArr) {
            i = new testObject();
            i.setID(idCounter);
            idCounter++;
            System.out.println(i+"\n");
        }
    }
}
