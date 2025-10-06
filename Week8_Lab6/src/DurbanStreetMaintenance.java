import java.util.Scanner;

/**
 * A class to report the total age of the people in each house and total age of the people in the street.
 * The number of houses in the street and the number of people and their ages is input from the user.
 *
 * @author Muhammad Ahsan Saleem
 */
public class DurbanStreetMaintenance {

    /**
     * A Scanner object to read input from the user's keyboard.
     */
    private static final Scanner keyboard = new Scanner(System.in);

    /**
     * The main method asks the user for number of houses in the street,
     * and then gets the number of people in each house alongside their ages.
     * The method then computes and displays the total ages in each house
     * and the sum of ages in the street.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        System.out.println("How many houses in the street?   : ");
        int numberOfHouses = keyboard.nextInt();

        int [] houseNumbersArray = new int[numberOfHouses];

        // Fill the houseNumbersArray array
        inputHouseNumbers(houseNumbersArray);

        int [][] houseAgesArray = new int[numberOfHouses][];

        // Fill the houseAgesArray array
        inputHouseAges(houseNumbersArray, houseAgesArray);

        int totalAgeStreet = 0;
        int totalAgeHouse;

        int house;
        int person;

        for (house = 0; house < houseAgesArray.length; house++) {

            totalAgeHouse = 0;
            for (person = 0; person < houseAgesArray[house].length; person++) {

                totalAgeHouse = totalAgeHouse + houseAgesArray[house][person];
                totalAgeStreet = totalAgeStreet + houseAgesArray[house][person];

            } // end of the inner loop

            System.out.println("house " + house + " has a total age of " + totalAgeHouse);
            totalAgeHouse = 0;

        } // end of the outer loop

        System.out.println("The street has a total age of " + totalAgeStreet);


    } // end of the main method

    /**
     * This method fills the houseNumbersArray with the house numbers
     * entered by the user.
     * @param houseNumbersArray The array to be filled with house numbers.
     */
    private static void inputHouseNumbers (int [] houseNumbersArray) {

        int index;
        for (index = 0; index < houseNumbersArray.length; index++) {
            System.out.print("What is the next house number?   : ");
            houseNumbersArray[index] = keyboard.nextInt();
        } // end of the for loop

    } // end of the inputHouseNumbers method

    /**
     * This method asks the user for the number of people in each house,
     * and then fills the houseAgesArray with the ages of each person in the house.
     * @param houseNumbersArray The array which contains house numbers.
     * @param houseAgesArray The 2-D which is has to be filled with the ages of each person in each house.
     */
    private static void inputHouseAges(int [] houseNumbersArray, int [][] houseAgesArray) {

        int house;

        for (house = 0; house < houseAgesArray.length; house++) {

            System.out.print("How many people live in number " + houseNumbersArray[house] + " : ");
            int numberOfColumns = keyboard.nextInt();

            houseAgesArray[house] = new int[numberOfColumns];

            int column;

            for (column = 0; column < houseAgesArray[house].length; column++) {

                System.out.print("What is the age of person" + (column + 1) +   "      : ");
                houseAgesArray[house][column] = keyboard.nextInt();

            } // end of the inner for loop for the person

        } // end of the outer for loop for the house

    } // end of the inputHouseAges method


} // end of the DurbanStreetMaintenance class
