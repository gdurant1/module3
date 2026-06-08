import java.util.Scanner;
public class durant_JF_5_1_5 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double average;
        int daysAbsent;
        boolean exempt=false;

        System.out.println("This program will determine if you can skip Final Exam.");
        System.out.println("Please answer the following questions.");
        System.out.println("What is your average in the class");
        average = keyboard.nextDouble();

        System.out.println("How many lectures have you missed?");
        daysAbsent = keyboard.nextInt();

        if(average >=90){
            if(daysAbsent <3) exempt = true;
        }
        else if(average>=80){
            if (daysAbsent <=0) exempt = true;
        }

        if(exempt) System.out.println("Congratulations! You can miss the Final Exam");
        else System.out.println("You are not exempt from the Final Exam");

    }
}
