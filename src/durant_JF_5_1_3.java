import java.util.InputMismatchException;
import java.util.Scanner;
public class durant_JF_5_1_3 {
    static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean validExit; // for do/while loop to run program again
        int choice;         //for user choice
        int choice2;        //for user exit choice
        double weight = 0;       //for user weight
        boolean validInput; //for try/catch loop
        do {
            do {
                System.out.println("Enter planet number.");
                System.out.println("1. Venus" + '\n' + "2. Mars");
                System.out.println("3. Jupiter" + '\n' + "4. Saturn");
                choice = keyboard.nextInt();
            } while (choice < 1 || choice > 4); //will crash with char/string

            do {
                try {
                    System.out.println("Enter weight");
                    weight = keyboard.nextDouble();
                    validInput = false;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter only numbers");
                    validInput = true;
                }
            } while (validInput);

            if (choice == 1) {
                System.out.println("Your weight on Venus is " + (weight * .1) + "pounds.");
            } else if (choice == 2) {
                System.out.println("Your weight on Mars is" + (weight * .38) + "pounds.");
            } else if (choice == 3) {
                System.out.println("Your weight on Jupiter is " + (weight * .1) + "pounds.");
            } else if (choice == 4) {
                System.out.println("Your weight on Saturn is " + (weight * .1) + "pounds.");
            } //left else-if, can add planets later

            System.out.println("Enter 1 to do again" + '\n' + "Enter 2 to Exit program" + '\n');
            choice2 = keyboard.nextInt();
            if (choice2 == 1) {
                validExit = true;
            } else {
                validExit = false;
            }
        } while (validExit);


    }
}
