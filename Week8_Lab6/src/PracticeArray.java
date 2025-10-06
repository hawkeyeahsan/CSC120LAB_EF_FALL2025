import java.util.Scanner;

public class PracticeArray {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("WEEK 8 - LAB 6 PRACTICE ARRAY");

        System.out.println("Enter the number of rows: ");
        int numberOfRows = keyboard.nextInt();

        int [][] yourArray = new int[numberOfRows][];

        int row;

        for (row = 0; row < yourArray.length; row++) {

            System.out.println("At index row " + row + ": How many columns do you want to create? ");
            int numberOfColumns = keyboard.nextInt();

            yourArray[row] = new int[numberOfColumns];

            int column;

            for (column = 0; column < yourArray[row].length; column++) {

                System.out.println("At row " + row + ", column " + column + ": Enter the value to store: ");
                yourArray[row][column] = keyboard.nextInt();

            } // end of the inner for loop for the column

        } // end of the outer for loop for the row

        // DISPLAY THE CONTENT OF THE ARRAY
        for (row = 0; row < yourArray.length; row++) {

            int column;

            for (column = 0; column < yourArray[row].length; column++) {

                System.out.println("At row " + row + ", column " + column + ": The value is: " + yourArray[row][column]);

            } // end of the inner for loop for the column

        } // end of the outer for loop for the row


    } // end of the main method


    public static void fillTheArray (int [] givenArray) {

        int index;
        for (index = 0; index < givenArray.length; index++) {
            System.out.print("At index [" + index + "]: Please enter the value to be stored: ");
            givenArray[index] = keyboard.nextInt();
        } // end of the for loop

        // DISPLAY THE CONTENT OF THE ARRAY
        for (index = 0; index < givenArray.length; index++) {
            System.out.println("At index [" + index + "]: The value is: " + givenArray[index]);
        } // end of the for loop

    } // end of the fillTheArray method


} // end of the PracticeArray class
