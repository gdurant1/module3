import java.util.InputMismatchException;
import java.util.Scanner;

public class durant_JF_5_1_2 {
        static void main(String args[]) {
            Scanner keyboard = new Scanner(System.in);
            int choice;
            double x, y;
            boolean validInput;

            do{
                System.out.println("Enter options 1 ");
                System.out.println("1. (+) Addition");
                System.out.println("2. (-) Subtraction");
                System.out.println("3. (x) Multiplication");
                System.out.println("4. (/) Division");
                System.out.println("5. (%) Remainder");
                choice = keyboard.nextInt();
            } while (choice < 1 || choice > 5);

            do{
                try{
                System.out.println("Enter first number.");
                x = keyboard.nextDouble();
                System.out.println("Enter second number.");
                y = keyboard.nextDouble();
                validInput = false;
                }
                catch(InputMismatchException e){
                    System.out.println("Please enter numbers only.");
                    validInput = true;
                }
            }while (validInput);



        }
    }
