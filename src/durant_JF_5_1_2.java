import java.util.InputMismatchException;    //needed for try/catch exception
import java.util.Scanner;                   //needed for scanner

public class durant_JF_5_1_2 {
        static void main(String args[]) {
            Scanner reader = new Scanner(System.in);
            boolean validExit;      // for do/while loop to run again or exit

            do {
                int choice;             //for user choice
                int choice2;            //for use choice to exit or go again
                double x = 0, y = 0;    //for user numbers
                boolean validInput;     //for try/catch,  will loop as long as validInput is true

                do { //simple do/while loop for user choice.  will crash if other data type is used
                    System.out.println("Enter options 1 to 5 ");
                    System.out.println("1. (+) Addition");
                    System.out.println("2. (-) Subtraction");
                    System.out.println("3. (x) Multiplication");
                    System.out.println("4. (/) Division");
                    System.out.println("5. (%) Remainder");
                    choice = reader.nextInt();}
                while (choice < 1 || choice > 5);


                do { //do while loop to get user numbers,  included try/catch to ensure only numbers are used
                    try {
                        System.out.println("Enter first number.");
                        x = reader.nextDouble();
                        System.out.println("Enter second number.");
                        y = reader.nextDouble();
                        validInput = false; }     //changing validInput to false will cause program to exit do/while loop.
                    catch (InputMismatchException e) {
                        System.out.println("Please enter only numbers.");
                        validInput = true; //setting validInput to true will keep user inside do/while loop
                    } }
                while (validInput);

                if (choice == 1) {
                    System.out.println(x + " + " + y + " = " + (x + y)); }
                else if (choice == 2) {
                    System.out.println(x + " - " + y + " = " + (x - y)); }
                else if (choice == 3) {
                    System.out.println(x + " x " + y + " = " + (x * y)); }
                else if (choice == 4) {
                    System.out.println(x + " / " + y + " = " + (x / y));}
                else {
                    System.out.println("The Remainder of " + x + " / " + y + " is " + (x % y));
                }

                //user choice to run program again, or exit
                System.out.println("Enter 1 to go again.");
                System.out.println("Enter 2 to Exit program.");
                choice2 = reader.nextInt();

                //changes validExit based on user choice
                if (choice2 == 1) {
                    validExit = true;}
                else {
                    validExit = false;
                }

            } while (validExit);
        }
    }
