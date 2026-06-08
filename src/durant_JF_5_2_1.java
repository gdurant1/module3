import java.util.Scanner;
import java.lang.String;
public class durant_JF_5_2_1 {
    static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int counter = 0; //for user input
        int userInput;
        char message[] = new char[10];


        System.out.println("Enter 10 numbers\n" + "Your choices are:\n");
        System.out.println("1 = D\n" + "2 = W\n" + "3 = E\n" + "4 = L\n");
        System.out.println("5 = H\n" + "6 = O\n" + "7 = R\n");

        for (int i = 1 ; i <=10; i ++){
            System.out.println("Enter number "+ i + ": ");
            userInput = keyboard.nextInt();
            if (userInput == 1){}
            else if (userInput == 2){message[i] = 'D';}
            else if (userInput == 3){message[i] = 'W';}
            else if (userInput == 4){message[i] = 'E';}
            else if (userInput == 5){message[i] = 'H';}
            else if (userInput == 6){message[i] = 'O';}
            else if (userInput == 7){message[i] = 'R';}
            else {
                System.out.println("Invalid number!, Please try again");
                i--; //to remove incorrect i++ in loop
            }


        }
    }
}
