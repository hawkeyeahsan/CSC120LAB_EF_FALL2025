import java.util.Scanner;

/**
 * A class to determine if user-provided integers are Fibonacci numbers and/or prime numbers.
 * The program takes up to 10 integers from the user and analyzes each one.
 *
 * @author Muhammad Ahsan Saleem
 * @version 1.0
 */
public class FascinatingNumber {

    /**
     * A Scanner object to read input from the user's keyboard.
     */
    private static final Scanner keyboard = new Scanner(System.in);
    /**
     * A sentinel value (0) used to stop user input.
     */
    private static final int SENTINEL_VALUE = 0;

    /**
     * The main method prompts the user for numbers,
     * stores them in an array, and then iterates through the array to check
     * if each number is a Fibonacci number and/or a prime number, printing the results.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        int [] dataArray = new int[10];
        int numberOfIntegers = getToFillTheIntegerArray(dataArray);
        int index;

        boolean isPrimeNumber;
        boolean isFibonacciNumber;

        for (index = 0; index < numberOfIntegers; index++) {

            isPrimeNumber = isPrime(dataArray[index]);
            isFibonacciNumber = isFibonacci(dataArray[index]);

            if (isFibonacciNumber) {
                System.out.print(dataArray[index] + " is Fibonacci ");
            }
            else {
                System.out.print(dataArray[index] + " is not Fibonacci ");
            }

            if (isPrimeNumber) {
                System.out.println("and is prime");
            }
            else {
                System.out.println("and is not prime");
            }

        } // end of the for loop

    } // end of the main method

    /**
     * Checks if a given integer is a prime number.
     * An integer is prime if it is greater than 1 and has no positive divisors other than 1 and itself.
     *
     * @param candidate The integer to check.
     * @return {@code true} if the candidate is a prime number, {@code false} otherwise.
     */
    public static boolean isPrime(int candidate) {

//        int divisor;
//
//        for (divisor = 2; divisor < givenNumber; divisor++) {
//
//            if (givenNumber % divisor == 0) {
//
//                return false;
//
//            }
//
//        } // end of the for loop
//
//        return true;

        long divisor = 2;

        while (divisor <= Math.sqrt(candidate)) {
            if (candidate % divisor == 0) {
                return(false);
            }
            divisor++;
        }
        return(true);

    } // end of the isPrime method


    /**
     * Checks if a given integer is a Fibonacci number.
     * The method generates Fibonacci numbers iteratively and checks if the given number
     * matches any number in the sequence.
     *
     * @param givenNumber The integer to check.
     * @return {@code true} if the givenNumber is a Fibonacci number, {@code false} otherwise.
     */
    public static boolean isFibonacci(int givenNumber) {

        int previous = 0;
        int current = 1;

        int index;
        int next;

        for (index = 0; index < givenNumber; index++) {

            next = previous + current;

            if (next == givenNumber) {

                return true;

            }

            previous = current;
            current = next;

        } // end of the for loop

        return false;

    } // end of the isFibonacci method


    /**
     * Prompts the user to enter integers to fill a given array.
     * Input stops when the user enters the sentinel value (0) or when the array is full.
     *
     * @param givenArray The integer array to be filled with user input.
     * @return The number of integers the user actually entered (excluding the sentinel value).
     */
    public static int getToFillTheIntegerArray(int [] givenArray) {

        int userInputValue;
        int index = 0;

        System.out.print("Please enter numbers (0 to stop) : ");

        do {

            userInputValue = keyboard.nextInt();
            givenArray[index] = userInputValue;
            index++;

        } while(userInputValue != SENTINEL_VALUE && index < givenArray.length);

        return index - 1;


    } // end of the getToFillTheIntegerArray method


} // end of the FascinatingNumber class

