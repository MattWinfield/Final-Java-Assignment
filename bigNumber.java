    /*
     * Author Matthew Winfield
     * Purpose  Input a number if the number is greater than 1,000,000, output 
     * " that is a big number".
     */

import java.util.Scanner;

public class bigNumber {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please Input a Number");
        int num = input.nextInt();
        
        if(num>1000000){
            System.out.println("That is a big number");
        }
    }
    
}
