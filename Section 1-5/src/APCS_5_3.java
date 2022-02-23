

import java.util.Scanner;

public class APCS_5_3 {
    public static void main(String[] args) {
        String temp = "";
        int val = 0;
        int nums[] = new int[101];

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Please enter a number from -50 - 50 or q to quit: ");
            temp = sc.next();

            if(temp.equals("q")) {
                System.out.println("\nYou entered:");
                for(int i = 0; i <= 100; i++) {
                    if(nums[i] > 0)
                        System.out.println((i-50)+": "+nums[i]+" times");
                }
                System.out.println("\nHave a great day!\n");
                break;
            }
            else
                val = Integer.parseInt(temp);
            
            if(val > 50 || val < -50)
                System.out.println("That number is outside of the range -50 to 50");
            else
                nums[val+50]++;
        }
        sc.close();
    }
}