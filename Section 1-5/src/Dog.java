
public class Dog {
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
		name = n; }

	public String toString()
	{
		String result = "";
		result += "Id:\t"+id+"\tName:\t"+name;
		return result;
	}
}
	
