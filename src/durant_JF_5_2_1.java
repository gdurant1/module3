import java.util.Scanner;
import java.lang.String;
public class durant_JF_5_2_1 {
    static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int counter = 0; //for user input
        int userInput;
        int choice;
        boolean validExit;
        char message[] = new char[10];


        System.out.println("Enter 10 numbers\n" + "Your choices are:");
        System.out.println("1 = D\n" + "2 = W\n" + "3 = E\n" + "4 = L");
        System.out.println("5 = H\n" + "6 = O\n" + "7 = R\n");

        do {
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter number " + (i + 1) + ": ");
                userInput = keyboard.nextInt();
                if (userInput == 1) {
                    message[i] = 'D';}
                else if (userInput == 2) {
                    message[i] = 'W';}
                else if (userInput == 3) {
                    message[i] = 'E';}
                else if (userInput == 4) {
                    message[i] = 'L';}
                else if (userInput == 5) {
                    message[i] = 'H';}
                else if (userInput == 6) {
                    message[i] = 'O';}
                else if (userInput == 7) {
                    message[i] = 'R';}
                else {
                    System.out.println("Invalid number!, Please try again");
                    i--; //to remove incorrect i++ in loop
                }

            }
            System.out.println("Message: ");
            for (int i = 0; i < message.length; i++) {
                System.out.print(message[i] + " " );
            }
            System.out.println();

            System.out.println("Enter 1 to go again.");
            System.out.println("Enter 2 to Exit program.");
            choice = keyboard.nextInt();

            if (choice == 1) {
                validExit = true;}
            else {
                validExit = false;
            }

        }while(validExit);

    }
}
