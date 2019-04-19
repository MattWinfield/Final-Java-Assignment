
import java.util.Scanner;


/*
     * Author Matthew Winfield
     * Using a for loop, input a number 10 times, outputing the sum after the
     * for loop has run 
 */
public class ForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            num = input.nextInt();
            sum = sum + num;
        }
        
        System.out.println("The sum of these numbers is: " + sum);

    }

}
