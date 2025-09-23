import java.util.Scanner;

public class ScubaNitrox {

    private static final Scanner keyboard = new Scanner(System.in);
    private static final double FEET_PER_ATM = 33.0;
    private static final double MAX_O2_PRESSURE = 1.4;
    private static final double CONTINGENCY_O2_PRESSURE = 1.6;


    public static void main(String[] args) {

        // Declare the variables
        int depth;
        int percentageO2;
        double ambientPressure;
        double partialPressure;
        char o2Group;
        boolean exceedsMaximal;
        boolean exceedsContingency;

        // Get input data
        System.out.println("Enter depth and percentage O2   : ");
        depth = keyboard.nextInt();
        percentageO2 = keyboard.nextInt();

        // Compute the ambient pressure and partial pressure
        ambientPressure = (depth / FEET_PER_ATM) + 1;
        System.out.println("Ambient pressure                : " + ambientPressure);

        partialPressure = (percentageO2 / 100.0) * ambientPressure;
        System.out.println("O2 pressure                     : " + partialPressure);

        // Display the warnings
        o2Group = (char)((int)(partialPressure * 10) + (int)'A');
        System.out.println("O2 group                        : " + o2Group);

        exceedsMaximal = partialPressure > MAX_O2_PRESSURE;
        exceedsContingency = partialPressure > CONTINGENCY_O2_PRESSURE;

        System.out.println("Exceeds maximal O2 pressure     : " + exceedsMaximal);
        System.out.println("Exceeds contingency O2 pressure : " + exceedsContingency);


    } // end of the main method

} // end of the ScubaNitrox class
