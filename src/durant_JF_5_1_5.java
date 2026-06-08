import java.util.Scanner;   //needed for scanner
public class durant_JF_5_1_5 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double average;
        int daysAbsent;

        //flavor text for user
        System.out.println("This program will determine if you can skip Final Exam.");
        System.out.println("Please answer the following questions.");

        //asks user for input
        System.out.println("What is your average in the class");
        average = reader.nextDouble();
        System.out.println("How many lectures have you missed?");
        daysAbsent = reader.nextInt();

        //prints result based
        if(average >=90 && daysAbsent < 3 || average >=80 && daysAbsent <=0 ){
            System.out.println("Congratulations! You can miss the Final Exam");
        }
        else System.out.println("You are not exempt from the Final Exam");

    }
}
