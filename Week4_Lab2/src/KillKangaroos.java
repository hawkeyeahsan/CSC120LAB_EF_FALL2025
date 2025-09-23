import java.util.Scanner;

public class KillKangaroos {

    private static Scanner keyboard = new Scanner(System.in);
    private static final double ROAD_WIDTH = 0.01;
    private static final double PROBABILITY_CONSTANT = 1.47;


    public static void main(String[] args) {

        // Declare variables
        double sideLength;
        double roadLength;
        int numOfKangaroos;
        double kangarooDensity;
        double roadSurfaceArea;
        double expectedKills;

        // Get input data
        System.out.println("Enter side of square in km  : ");
        sideLength = keyboard.nextDouble();
        System.out.println("Enter roads length in km    : ");
        roadLength = keyboard.nextDouble();
        System.out.println("Enter number of 'roos       : ");
        numOfKangaroos = keyboard.nextInt();

        // Process data
        kangarooDensity = numOfKangaroos / (sideLength * sideLength);
        roadSurfaceArea = roadLength * ROAD_WIDTH;
        expectedKills = kangarooDensity * roadSurfaceArea * PROBABILITY_CONSTANT;

        //Output results
        System.out.println("Expected number of kills is : " + (int)expectedKills);
        // %1 extracts the value after the decimal point e.g 3.22 % 1 = 0.22
        System.out.println("Expected number of injuries : " + (int)Math.ceil(expectedKills % 1));


    } // end of the main method

} // end of the KillKangaroos class
