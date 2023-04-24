package Project5;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {

        //Get first number from user
        System.out.print("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();

        // Get second number from user
        System.out.print("Please enter second number: ");
        int number2 = input.nextInt();


        //Show user choices
        System.out.println("Please select one of the following options:\n" 
        + "1 - Add\n" 
        + "2 - Subtract\n"
        + "3 - Multiply\n"
        + "4 - Divide\n");

        // Get user choice
        System.out.print("Choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.printf("%d + %d = %d", number1, number2, number1 + number2).println();
        } else if (choice == 2) {
            System.out.printf("%d - %d = %d", number1, number2, number1 - number2).println();
        } else if (choice == 3) {
            System.out.printf("%d * %d = %d", number1, number2, number1 * number2).println();
        } else if (choice == 4) {
            System.out.printf("%d / %d = %d", number1, number2, number1 / number2).println();
        } else {
            System.out.println("Invalid input");
        }

        input.close();
    }
}





