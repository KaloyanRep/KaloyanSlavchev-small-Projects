import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args){


        Scanner keyboard = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        double average;

        System.out.println("Please enter three numbers ?: " );
        num1=keyboard.nextInt();
        num2=keyboard.nextInt();
        num3=keyboard.nextInt();
        keyboard.nextLine();

        average = (num1 +num2 + num3) /3.0;
        System.out.println("Your average is ?: " + average);




    }
}
