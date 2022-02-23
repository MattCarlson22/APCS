import java.util.Scanner;

public class APCS_5_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many tests would you like to enter? ");
        int rep = sc.nextInt();

        while(rep < 1) {
            System.out.print("Please enter a value greater than 0. ");
            rep = sc.nextInt();
        }

        int tests[] = new int [rep];

        for(int i = 0; i < tests.length; i++) {
            System.out.print("Please enter test score "+(i+1)+": ");
            tests[i] = sc.nextInt();
        }

        int min = tests[0], max = min;
        double avg = 0.0;

        for(int i = 0; i < tests.length; i++) {
            if(tests[i] > max) 
                max = tests[i];
            
            else if(tests[i] < min) 
                min = tests[i]; 
            
            avg += tests[i];
        }

        avg /= tests.length;

        System.out.println("The lowest test score was "+min);
        System.out.println("The highest test score was "+max);
        System.out.println("The average test score was "+avg);

        sc.close();
    }
}