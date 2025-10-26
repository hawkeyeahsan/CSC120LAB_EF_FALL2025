import java.util.Scanner;

/**
 * The DentalRecords program manages tooth data for a family in Florida.
 * It allows users to:
 * - Input family members and their upper/lower teeth records
 * - Print all teeth records
 * - Extract (remove) specific teeth
 * - Compute root canal indices using a quadratic formula.
 * This program validates user inputs to ensure that menu options and tooth types
 * are case-insensitive and within specified limits.
 *
 * @author Muhammad Ahsan Saleem
 */
public class DentalRecords {

    /** Scanner object for user input */
    private static final Scanner keyboard = new Scanner(System.in);
    /** Maximum number of family members allowed */
    private static final int MAX_FAMILY_MEMBERS = 6;
    /** Maximum number of teeth per jaw */
    private static final int MAX_TEETH = 8;

    /**
     * The main method that gets the number of people in the family,
     * calls methods to fill the arrays, and gets the menu option from the user.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        int numOfFamilyMembers;
        String menuOption;

        System.out.println("Welcome to the Floridian Tooth Records");
        System.out.println("--------------------------------------");

        System.out.print("Please enter number of people in the family : ");
        numOfFamilyMembers = keyboard.nextInt();

        // Validating the number of people in the family
        while (numOfFamilyMembers < 1 || numOfFamilyMembers > MAX_FAMILY_MEMBERS) {

            System.out.print("Invalid number of people, try again         : ");
            numOfFamilyMembers = keyboard.nextInt();

        } // end of the while loop

        // The 3-D array that will store family's teeth data
        char[][][] familyTeethRecord = new char[numOfFamilyMembers][2][];
        // The 1-D array to store family members' names
        String[] familyNames = new String[numOfFamilyMembers];

        // Populate the arrays
        getFamilyData(familyTeethRecord, familyNames);

        // Display the menu, and get the user's choice
        menuOption = getMenuOption();

        // Performing the task requested by the user, and exiting the program if "X" is input
        while(!menuOption.equals("X")) {

            if (menuOption.equals("P")) {
                printTeethRecord(familyTeethRecord, familyNames);
            }
            else if (menuOption.equals("E")) {
                extractTooth(familyTeethRecord, familyNames);
            }
            else {
                performRootCanal(familyTeethRecord);
            }

            menuOption = getMenuOption();
        } // end of the while loop
        exit();

    } // end of the main method

    /**
     * Collects the names and teeth data for each family member.
     * @param familyTeethRecord a 3D array storing teeth data for all family members
     * @param familyNames an array storing the names of all family members
     */
    public static void getFamilyData(char [][][] familyTeethRecord, String[] familyNames) {

        int familyMember, jaw, toothIndex;
        String toothTypes;

        for (familyMember = 0; familyMember < familyTeethRecord.length; familyMember++) {

            System.out.print("Please enter the name for family member " + (familyMember + 1) + "   : ");
            familyNames[familyMember] = keyboard.next();

            for (jaw = 0; jaw < 2; jaw++) {

                if (jaw == 0) {
                    System.out.printf("Please enter the uppers for %-15s %s", familyNames[familyMember], ": ");
                }
                else {
                    System.out.printf("Please enter the lowers for %-15s %s", familyNames[familyMember], ": ");
                }

                do {
                    toothTypes = keyboard.next();
                } while (!checkForValidTeeth(toothTypes));

                familyTeethRecord[familyMember][jaw] = new char[toothTypes.length()];

                for (toothIndex = 0; toothIndex < toothTypes.length(); toothIndex++) {
                    familyTeethRecord[familyMember][jaw][toothIndex] = Character.toUpperCase(toothTypes.charAt(toothIndex));
                } // end of the inner for loop
            } // end of the middle for loop
        } // end of the outer for loop

    } // end of the getFamilyData method

    /**
     * Validates a string of teeth characters.
     * Ensures the string contains only 'I', 'B', or 'M' and does not exceed max length.
     *
     * @param teeth a string representing teeth types
     * @return {@code true} if valid, otherwise {@code false}
     */
    public static boolean checkForValidTeeth(String teeth) {

        int tooth;
        char thisTooth;

        if (teeth.length() > MAX_TEETH) {
            System.out.print("Too many teeth, try again                   : ");
            return false;
        }

        for (tooth = 0; tooth < teeth.length(); tooth++) {

            thisTooth = Character.toUpperCase(teeth.charAt(tooth));
            if (thisTooth != 'B' && thisTooth != 'M' && thisTooth != 'I') {
                System.out.print("Invalid teeth types, try again              : ");
                return false;
            }

        } // end of the for loop
        return true;

    } // end of the checkForValidTeeth method

    /**
     * Displays the main menu and returns the selected option.
     *
     * @return a single uppercase letter representing the menu choice ('P', 'E', 'R', 'X')
     */
    public static String getMenuOption() {

        System.out.println();
        System.out.print("(P)rint, (E)xtract, (R)oot, e(X)it          : ");
        String menuOption = keyboard.next().toUpperCase();

        // Validating the menu option input by the user
        while (!menuOption.equals("P") && !menuOption.equals("E") && !menuOption.equals("R") && !menuOption.equals("X")) {

            System.out.print("Invalid menu option, try again              : ");
            menuOption = keyboard.next().toUpperCase();

        } // end of the while loop
        System.out.println();
        return menuOption;

    } // end of the getMenuOption method

    /**
     * Prints all teeth records for the family.
     *
     * @param familyTeethRecord the 3D array containing teeth information
     * @param familyNames the array of family member names
     */
    public static void printTeethRecord(char [][][] familyTeethRecord, String[] familyNames) {

        int familyMember, jaw, toothIndex;

        for (familyMember = 0; familyMember < familyTeethRecord.length; familyMember++) {

            System.out.println(familyNames[familyMember]);

            for (jaw = 0; jaw < 2; jaw++) {

                if (jaw == 0) {
                    System.out.print("  Uppers:  ");
                }
                else {
                    System.out.print("  Lowers:  ");
                }

                for (toothIndex = 0; toothIndex < familyTeethRecord[familyMember][jaw].length; toothIndex++) {
                    System.out.print((toothIndex + 1) + ":" + familyTeethRecord[familyMember][jaw][toothIndex] + "  ");
                } // end of the inner for loop

                System.out.println();

            } // end of the middle for loop
        } // end of the outer for loop

    } // end of the printTeethRecord method

    /**
     * Allows the user to extract a tooth by selecting a family member, jaw, and tooth number.
     * Validates inputs to ensure the tooth exists and is not already missing.
     *
     * @param familyTeethRecord the 3D array containing teeth information
     * @param familyNames the array of family member names
     */
    public static void extractTooth(char [][][] familyTeethRecord, String[] familyNames) {

        String name, toothLayer;
        boolean invalidTooth = false;
        boolean missingTooth = false;
        int index, toothNumber, jaw;

        System.out.print("Which family member                         : ");
        name = keyboard.next();
        index = familyMemberIndex(familyNames, name);

        while (index == -1) {

            System.out.print("Invalid family member, try again            : ");
            name = keyboard.next();
            index = familyMemberIndex(familyNames, name);

        } // end of the while loop

        System.out.print("Which tooth layer (U)pper or (L)ower        : ");
        toothLayer = keyboard.next();

        while (!toothLayer.equalsIgnoreCase("U") && !toothLayer.equalsIgnoreCase("L")) {

            System.out.print("Invalid layer, try again                    : ");
            toothLayer = keyboard.next();

        } // end of the while loop

        if (toothLayer.equalsIgnoreCase("U")) {
            jaw = 0;
        }
        else {
            jaw = 1;
        }

        System.out.print("Which tooth number                          : ");
        toothNumber = keyboard.nextInt();

        if (toothNumber < 1 || toothNumber > familyTeethRecord[index][jaw].length) {
            invalidTooth = true;
        }
        else if (familyTeethRecord[index][jaw][toothNumber - 1] == 'M') {
            missingTooth = true;
        }

        // Validating the tooth number input by the user
        while (invalidTooth || missingTooth) {

            if (invalidTooth) {
                System.out.print("Invalid tooth number, try again             : ");
            }
            else {
                System.out.print("Missing tooth, try again                    : ");
            }
            toothNumber = keyboard.nextInt();

            invalidTooth = false;
            missingTooth = false;

            if (toothNumber < 1 || toothNumber > familyTeethRecord[index][jaw].length) {
                invalidTooth = true;
            }
            else if (familyTeethRecord[index][jaw][toothNumber - 1] == 'M') {
                missingTooth = true;
            }

        } // end of the while loop

        familyTeethRecord[index][jaw][toothNumber - 1] = 'M';

    } // end of the extractTooth method

    /**
     * Finds the index of a family member in the names array.
     *
     * @param familyNames the array of family member names
     * @param nameToCheck the name to search for
     * @return the index of the member if found, otherwise -1
     */
    public static int familyMemberIndex(String[] familyNames, String nameToCheck) {

        int index;

        for (index = 0; index < familyNames.length; index++) {

            if (familyNames[index].equalsIgnoreCase(nameToCheck)) {
                return index;
            }

        } // end of the for loop
        return -1;

    } // end of the checkValidFamilyMember method

    /**
     * Calculates and prints the two root canal indices using the quadratic formula:
     * Ix² + Bx - M = 0
     *
     * @param familyTeethRecord the 3D array containing all teeth information
     */
    public static void performRootCanal(char [][][] familyTeethRecord) {

        double indexOne, indexTwo;
        int numOfIncisors = 0;
        int numOfBicuspids = 0;
        int numOfMissingTeeth = 0;
        int familyMember, jaw, toothIndex;

        for (familyMember = 0; familyMember < familyTeethRecord.length; familyMember++) {
            for (jaw = 0; jaw < 2; jaw++) {
                for (toothIndex = 0; toothIndex < familyTeethRecord[familyMember][jaw].length; toothIndex++) {

                    if (familyTeethRecord[familyMember][jaw][toothIndex] == 'I') {
                        numOfIncisors += 1;
                    }
                    else if (familyTeethRecord[familyMember][jaw][toothIndex] == 'B') {
                        numOfBicuspids += 1;
                    }
                    else {
                        numOfMissingTeeth += 1;
                    }

                } // end of the inner for loop
            } // end of the middle for loop
        } // end of the outer for loop

        // Quadratic formula
        indexOne = ((-numOfBicuspids) + Math.sqrt(Math.pow(numOfBicuspids, 2) - (4*numOfIncisors*(-numOfMissingTeeth)))) / (2*numOfIncisors);
        indexTwo = ((-numOfBicuspids) - Math.sqrt(Math.pow(numOfBicuspids, 2) - (4*numOfIncisors*(-numOfMissingTeeth)))) / (2*numOfIncisors);
        System.out.printf("One root canal at     %.2f\n", indexOne);
        System.out.printf("Another root canal at %.2f\n", indexTwo);

    } // end of the performRootCanal method

    /**
     * Prints an exit message when the program ends.
     */
    public static void exit() {

        System.out.println("Exiting the Floridian Tooth Records :-)");

    } // end of the exit method

} // end of the DentalRecords class
