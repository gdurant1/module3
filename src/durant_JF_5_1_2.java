import java.util.InputMismatchException;
import java.util.Scanner;

public class durant_JF_5_1_2 {
        static void main(String args[]) {
            Scanner keyboard = new Scanner(System.in);
            int choice;             //for user choice
            int choice2;            //for use choice to exit or go again
            double x, y;            //for user numbers
            boolean validInput;     //for try/catch,  will loop as long as validInput is true
            boolean validExit;      // for loop to run again

            do {
                //simple do/while loop for user choice.  will crash if other data type is used
                do {
                    System.out.println("Enter options 1 ");
                    System.out.println("1. (+) Addition");
                    System.out.println("2. (-) Subtraction");
                    System.out.println("3. (x) Multiplication");
                    System.out.println("4. (/) Division");
                    System.out.println("5. (%) Remainder");
                    choice = keyboard.nextInt();
                } while (choice < 1 || choice > 5);
                //do while loop to get user numbers,  included try/catch to ensure only numbers are used
                do {
                    try {
                        System.out.println("Enter first number.");
                        x = keyboard.nextDouble();
                        System.out.println("Enter second number.");
                        y = keyboard.nextDouble();
                        validInput = false;     //changing validInput to false will cause program to exit do/while loop.
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter numbers only.");
                        validInput = true; //setting validInput to true will keep user inside do/while loop
                    }
                } while (validInput);

                if (choice == 1) {
                    System.out.println(x + " + " + y + " = " + (x + y));
                } else if (choice == 2) {
                    System.out.println(x + " - " + y + " = " + (x - y));
                } else if (choice == 3) {
                    System.out.println(x + " x " + y + " = " + (x * y));
                } else if (choice == 4) {
                    System.out.println(x + " / " + y + " = " + (x / y));
                } else {
                    System.out.println("The Remainder of " + x + " / " + y + " is " + (x % y));
                }
                do {
                    System.out.println("Enter 1 to go again.");
                    System.out.println("Enter 2 to Exit program.");
                    choice2 = keyboard.nextInt();
                } while (choice2 < 1 || choice > 2);

                if (choice2 == 1) {
                    validExit = false;
                }
                else {
                    validExit = true;
                }
            } while (validExit);
        }
    }
