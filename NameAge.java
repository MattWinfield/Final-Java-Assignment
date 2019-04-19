
/*
     * Author Matthew Winfield
     * Input a name and age, then, using a while loop, print the name as many 
     *iterations as the age
 */
import java.util.Scanner;

public class NameAge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int age, counter = 0;

        System.out.println("Enter your name:");
        name = input.nextLine();
        System.out.println("Enter your age:");
        age = input.nextInt();

        while (age != counter) {

            System.out.println(name);
            counter++;

        }
    }

}
