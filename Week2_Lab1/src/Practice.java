import java.util.Scanner;

public class Practice {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello World...");

        // Declare 3 variables
        String studentName;
        int age;
        double gpa;

        System.out.println("What is your name?");
        studentName = keyboard.nextLine();

        System.out.println("How old are you?");
        age = keyboard.nextInt();

        System.out.println("What is your gpa?");
        gpa = keyboard.nextDouble();

        // Output the results
        System.out.println("Hello " + studentName + ". You are " + age + " years old and your GPA is " + gpa);

        System.out.println("Have a good day.");


    } // end of the main method

} // end of the Practice class
