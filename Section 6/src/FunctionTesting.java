interface StringFunction {
    String run(String str);
}
public class FunctionTesting{
    public static void main(String[] args) {
        StringFunction exclamation = (s) -> s + "!";
        System.out.println(exclamation.run("Hello"));
    }
}
