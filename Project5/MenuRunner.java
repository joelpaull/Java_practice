package Project5;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {

        //Get first number from user
        System.out.print("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        System.out.println("Number you Entered is: " + number1);
        input.close();

        // Get second number from user
        System.out.print("Please enter second number: ");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();
        System.out.println("Second number is: " + number2);
        input2.close();


        //Show user choices
        System.out.println("Please select one of the following options:\n" 
        + "1 - Add\n" 
        + "2 - Subtract\n"
        + "3 - Multiply\n"
        + "4 - Divide\n");

        // Get user choice
        System.out.println("Choice: ");
        Scanner choice_input = new Scanner(System.in);
        int choice = choice_input.nextInt();
        choice_input.close();

    }
}



