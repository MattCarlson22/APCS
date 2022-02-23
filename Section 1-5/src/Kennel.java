public class Kennel {

    private Dog[] dogKennel;
    private static int dogCount = 0;

    public Kennel() {
        Dog[] kennel = new Dog [10];
        dogKennel = kennel;
    }
    public void kennelAddDog(Dog d) {
        if(dogCount < 10) {
            dogKennel[dogCount] = d;
            dogCount++;
        }
        else {
            System.out.println("Kennel Full! Expanding it...");
        }
    }
    public void kennelRemoveDog(int d) {
        dogKennel[d] = null;
    }
    public int kennelGetCount() {
        return dogCount;
    }
    public void kennelDisplayDogs() {
        String str = "";
        int kennelSpace = 1;
        for(Dog d: dogKennel)
            str += "Kennel Space "+kennelSpace+": "+d+"\n";
        System.out.println(str);
    }
    public void kennelFeedDogs() {
        System.out.println("You fed all of the dogs!");
    }

}
