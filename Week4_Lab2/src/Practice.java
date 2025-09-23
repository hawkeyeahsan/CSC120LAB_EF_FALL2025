import java.util.Scanner;

public class Practice {

    private static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("WEEK 4 - LAB 2 PRACTICE");

        // Declare variables
        String studentName;
        int yearBorn;
        int age;

        // Get input data
        System.out.println("Enter your name: ");
        studentName = keyboard.nextLine();

        System.out.println("What year were you born in? ");
        yearBorn = keyboard.nextInt();

        // Process data
        age = 2025 - yearBorn;

        // Output result
        System.out.println("Hi " + studentName + ". You are " + age + " years old.");












/*        double result = 3.22;

        System.out.println("The whole = " + (int)result);

        System.out.println("The decimal part = " + (int)Math.ceil(result % 1));*/

    } // end of the main method

} // end of the Practice class
