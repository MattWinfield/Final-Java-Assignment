    /*
     * Author Matthew Winfield
     * input a number, if the number is greater than, less than or equal to 0, 
     * State as such.
     */

import java.util.Scanner;

public class Number {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please Input a Number");
        int num = input.nextInt();
        
        if(num>0){
            System.out.println("That number is positive");
        }
        else if (num == 0){
            System.out.println("That number is equal to 0");
        }
        else if (num<0){
            System.out.println("That number is negative");
        }
    }
    
}
