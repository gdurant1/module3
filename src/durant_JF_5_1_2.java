import java.util.Scanner;

public class durant_JF_5_1_2 {
        static void main(String args[]) {
            Scanner keyboard = new Scanner(System.in);
            int choice;
            double x, y;

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
                System.out.println("Enter first number.");
                x = keyboard.nextDouble();
                System.out.println("Enter second number.");
                y = keyboard.nextDouble();
            }while (!(x==int) && !(y==int));



        }
    }

}
