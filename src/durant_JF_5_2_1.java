import java.util.Scanner;   //needed for scanner
import java.lang.String;    //needed for array
public class durant_JF_5_2_1 {
    static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int counter = 0; //counter for user input
        int userInput; //to save user input
        int choice; //for user choice
        boolean validExit; //for user choice to exit program
        char message[] = new char[10]; //array for user input

        //flavor text to tell user the options
        System.out.println("Enter 10 numbers\n" + "Your choices are:");
        System.out.println("1 = D\n" + "2 = W\n" + "3 = E\n" + "4 = L");
        System.out.println("5 = H\n" + "6 = O\n" + "7 = R\n");

        // do/while loop runs while validExit=true
        do {
            //saves user input, and adds assigned letter to array
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter number " + (i + 1) + ": ");
                userInput = reader.nextInt();
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

            //prints final message on single line
            System.out.println("Message: ");
            for (int i = 0; i < message.length; i++) {
                System.out.print(message[i] + " " );
            }
            System.out.println();

            //user choice to run program again, or exit
            System.out.println("Enter 1 to go again.");
            System.out.println("Enter 2 to Exit program.");
            choice = reader.nextInt();

            //changes validExit based on user choice
            if (choice == 1) {
                validExit = true;}
            else {
                validExit = false;
            }

        }while(validExit);

    }
}
