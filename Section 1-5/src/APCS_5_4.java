import java.util.Scanner;

public class APCS_5_4 {
    public static void main(String[] args) {
        /*
		 * create a class called Kennel.
		 * A kennel objects is only used for storing and maintaining information about Dog objects, think Dog[] as an instance variable
		 * You should use the Dog class I provided to you
		 * When a kennel is created it should be able to store 10 Dog objects
		 * A method should be provided to add a Dog to the Kennel, which should ensure the Kennel is not full and if so you will need to expand to the current capacity + 10 more spaces
		 * A method should be provided to remove a Dog, it will receive the dog's id and remove that dog from the Kennel
		 * A method should be provided to get the current accurate count of Dogs in the Kennel, this is not the same as the size of the array 
		 * A method should be provided to Display all of the Dogs currently in the Kennel, no null strings should be output
		 * A method should be provided to feed all of the Dogs in the Kennel
		 * 
		 * Your APCS_5_4 driver file should thoroughly test that all of the functionality described above works correctly
		 */
		Kennel kennel1 = new Kennel();

		Dog d1 = new Dog(1,"d1");
		Dog d2 = new Dog(2,"d2");
		Dog d3 = new Dog(3,"d3");
		Dog d4 = new Dog(4,"d4");
		Dog d5 = new Dog(5,"d5");
		Dog d6 = new Dog(6,"d6");
		Dog d7 = new Dog(7,"d7");
		Dog d8 = new Dog(8,"d8");
		Dog d9 = new Dog(9,"d9");
		Dog d10 = new Dog(10,"d10");
		Dog d11 = new Dog(11,"d11");

		String stringInput = "";
        Scanner sc = new Scanner(System.in);

		while(!stringInput.equals("q")) {

			System.out.println("What would you like to do?");
			System.out.println("1. Add a dog to the kennel");
			System.out.println("2. Remove a dog from the kennel");
			System.out.println("3. Display how many dogs are in the kennel");
			System.out.println("4. Feed the dogs in the kennel");
			System.out.println("Press \"q\" to quit");

			System.out.print(">>> ");
			stringInput = sc.next();
			
			int input = Integer.parseInt(stringInput);

			switch(input) {
				case 1:
					System.out.println("Which dog would you like to add? (1-11)");
					System.out.print(">>> ");
					input = sc.nextInt();
						switch(input) {
							case 1: kennel1.kennelAddDog(d1);
								break;
							case 2: kennel1.kennelAddDog(d2);
								break;
							case 3: kennel1.kennelAddDog(d3);
								break;
							case 4: kennel1.kennelAddDog(d4);
								break;
							case 5: kennel1.kennelAddDog(d5);
								break;
							case 6: kennel1.kennelAddDog(d6);
								break;
							case 7: kennel1.kennelAddDog(d7);
								break;
							case 8: kennel1.kennelAddDog(d8);
								break;
							case 9: kennel1.kennelAddDog(d9);
								break;
							case 10: kennel1.kennelAddDog(d10);
								break;
							case 11: kennel1.kennelAddDog(d11);
								break;
							default: System.out.println("Please enter a number from 1-11 \n");
								break;
						} // case 1 switch statement
					System.out.println("You added a dog!");
					break;
				case 2:
					System.out.println("Remove a dog from which spot in the kennel? (1-10)");
					System.out.print(">>> ");
					input = sc.nextInt();
					if(input >= 1 && input <= 10) {
						kennel1.kennelRemoveDog(input);
						System.out.println("Dog in slot "+input+" was removed!");
					}
					else {
						System.out.println("That slot is invalid!");
					}
					break;
				case 3:
					System.out.println("There are "+kennel1.kennelGetCount()+" dog(s) in the kennel");
					break;
				case 4:
					kennel1.kennelFeedDogs();
					break;
				default:
					System.out.println("Please select a number 1-4 or \"q\" to quit\n");
					break;
			}// switch statement
		} // while loop
		System.out.println("Have a nice day!");
		sc.close();
    }
}