import java.util.Scanner;

public class IAm {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String inputSentence;
        String allQualities = "";

        System.out.println("Please enter sentences, . to end.");

        do {

            inputSentence = keyboard.nextLine();
            if (inputSentence.startsWith("I am ")) {
                allQualities += (inputSentence.substring(5)) + ", ";
            }

        } while (!inputSentence.equals("."));

        System.out.println("The qualities are " + allQualities);

    } // end of the main method

} // end of the IAm class
