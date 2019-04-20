
import java.util.Random;
import java.util.Scanner;


/*
     * Author Matthew Winfield
     * Using Methods will produce a menu and run the previous excercises using 
     * seperate methods
 */
public class Index {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int num;

        menu();
        num = in.nextInt();
        conditionMenu(num);

    }

    public static void menu() {
        System.out.println("Type the number corresponding to the desired "
                + "application: ");
        System.out.println("==============================");
        System.out.println("1. Lisa: Variable Declarations");
        System.out.println("2. Big Number: If Statements");
        System.out.println("3. Number: If Else Statements");
        System.out.println("4. Two: Opperands");
        System.out.println("5. Name Age: Counter While Loops");
        System.out.println("6. For Loop: Counter For Loops");
        System.out.println("7. Months: Arrays ");
        System.out.println("8. Cards: Methods");
    }

    public static void conditionMenu(int num) {
        if (num == 1) {
            lisa();
            menu();
            num = in.nextInt();
            conditionMenu(num);

        }
        if (num == 2) {
            bigNumber();
            menu();
            num = in.nextInt();
            conditionMenu(num);

        }
        if (num == 3) {
            number();
            menu();
            num = in.nextInt();
            conditionMenu(num);
        }
        if (num == 4) {
            two();
            menu();
            num = in.nextInt();
            conditionMenu(num);
        }
        if (num == 5) {
            nameAge();
            menu();
            num = in.nextInt();
            conditionMenu(num);

        }
        if (num == 6) {
            forLoop();
            menu();
            num = in.nextInt();
            conditionMenu(num);
        }
        if (num == 7) {
            months();
            menu();
            num = in.nextInt();
            conditionMenu(num);
        }
        if (num == 8) {
            cards();
            menu();
            num = in.nextInt();
            conditionMenu(num);
            
        } else if (num < 1 || num > 8) {
            System.out.println("Incorrect Option. Try again");
            menu();
            num = in.nextInt();
            conditionMenu(num);
        }
    }

    public static void lisa() {

        String name = "Lisa";
        int age = 9;
        double height = 133.3;
        double weight = 27.8;

        System.out.println(name + " is " + age + " years old and weighs " + height + "\n"
                + name + " weighs " + weight + " kilograms.");

    }

    public static void bigNumber() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Input a Number");
        int num = input.nextInt();

        if (num > 1000000) {
            System.out.println("That is a big number");
        }
    }

    public static void number() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Input a Number");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("That number is positive");
        } else if (num == 0) {
            System.out.println("That number is equal to 0");
        } else if (num < 0) {
            System.out.println("That number is negative");
        }
    }

    public static void two() {

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

    public static void nameAge() {

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

    public static void forLoop() {

        Scanner input = new Scanner(System.in);
        int num, sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            num = input.nextInt();
            sum = sum + num;
        }

        System.out.println("The sum of these numbers is: " + sum);

    }

    public static void months() {

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

    public static void cards() {

        String deck[] = {"Ace_of_Hearts", "2_of_Hearts", "3_of_Hearts",
            "4_of_Hearts", "5_of_Hearts", "6_of_Hearts", "7_of_Hearts",
            "8_of_Hearts", "9_of_Hearts", "10_of_Hearts", "Jack_of_Hearts",
            "Queen_of_Hearts", "King_of_Hearts", "Ace_of_Spades", "2_of_Spades",
            "3_of_Spades", "4_of_Spades", "5_of_Spades", "6_of_Spades",
            "7_of_Spades", "8_of_Spades", "9_of_Spades", "10_of_Spades",
            "Jack_of_Spades", "Queen_of_Spades", "King_of_Spades",
            "Ace_of_Diamonds", "2_of_Diamonds", "3_of_Diamonds", "4_of_Diamonds",
            "5_of_Diamonds", "6_of_Diamonds", "7_of_Diamonds", "8_of_Diamonds",
            "9_of_Diamonds", "10_of_Diamonds", "Jack_of_Diamonds", "Queen_of_Diamonds",
            "King_of_Diamonds", "Ace_of_Clubs", "2_of_Clubs", "3_of_Clubs",
            "4_of_Clubs", "5_of_Clubs", "6_of_Clubs", "7_of_Clubs",
            "8_of_Clubs", "9_of_Clubs", "10_of_Clubs", "Jack_of_Clubs",
            "Queen_of_Clubs", "King_of_Clubs"};

        deck = shuffle(deck);

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);

        }

    }

    public static String[] shuffle(String[] z) {

        Random rnd = new Random();
        for (int i = z.length - 1; i >= 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = z[index];
            z[index] = z[i];
            z[i] = a;
        }
        return z;
    }

}
