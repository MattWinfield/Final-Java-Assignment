
import java.util.Scanner;


/*
     * Author Matthew Winfield
     * Using an array, store the names of every month and using 
 */
public class Months {

    public static void main(String[] args) {

        String r = "r";
        String[] months = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", 
            "December"};

        for (int i = 0; i < months.length; i++) {
            if (months[i].contains(r)) {
                System.out.println(months[i]);
            }

        }

    }

}
