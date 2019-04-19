
/*
     * Author Matthew Winfield
     * input a number, if the number is greater than, less than or equal to 0, 
     * State as such.
 */

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Input First Number:");
        int num1 = input.nextInt();

        System.out.println("Please Input Second Number:");
        int num2 = input.nextInt();

        if (num1 == 2 && num2 == 2) {
            System.out.println("Both numbers are equal to 2.");
        } else if (num1 == 2 || num2 == 2) {
            if (num1 == 2 && num2 != 2) {
                System.out.println("The first number you entered is equal to 2, the second is not.");
            } else if (num1 != 2 && num2 == 2) {
                System.out.println("The second number you entered is equal to 2, the first is not.");
            }
        } else if (num1 != 2 && num2 != 2) {
            System.out.println("Both of the entered numbers are not 2.");
        }

    }

}
