public class Dog implements Comparable<Dog> {
    private int id;
    private String name;
    public Dog(int i, String n)
    {
        id = i;
        name = n;
    }
    public void feed() {
        System.out.println("Dog: "+name+" is eating"); }

    public void setName(String n) {
        name = n;
    }
    public void setID(int i) {
        id = i;
    }

    public String toString()
    {
        String result = "";
        result += "Id:\t"+id+"\tName:\t"+name;
        return result;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public boolean equals(String n) {
        return name.equals(n);
    }
    public boolean equals(int i) {
        return id == i;
    }

    public boolean equals(Dog d) {
        return ((id == d.id) && (name.equals(d.name)));
    }

    @Override
    public int compareTo(Dog other) {
        return id - other.getID();
    }
}

