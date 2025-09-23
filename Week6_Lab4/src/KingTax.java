import java.util.Scanner;

public class KingTax {

    private static final Scanner keyboard = new Scanner(System.in);

    private static final double STINKING_RICH = 500000.0;
    private static final double QUITE_RICH = 200000.0;
    private static final double MIAMI_POOR = 100000.0;
    private static final double AVERAGE = 50000.0;
    private static final double REALISTIC = 20000.0;

    private static final double HIGH_RATE = 0.25;
    private static final double MEDIUM_RATE = 0.10;
    private static final double LOW_RATE = 0.03;


    private static double computeTaxableIncome(double income, double deductions) {

        if (income >= deductions) {
            return income - deductions;
        }
        else {
            return 0.0;
        }

    } // end of the computeTaxableIncome method

    private static char chooseTaxGroup(double taxable) {

        if (taxable >= STINKING_RICH) {
            return 'S';
        }
        else if (taxable >= QUITE_RICH) {
            return 'Q';
        }
        else if (taxable >= MIAMI_POOR) {
            return 'M';
        }
        else if (taxable >= AVERAGE) {
            return 'A';
        }
        else if (taxable >= REALISTIC) {
            return 'R';
        }
        else {
            return 'P';
        }

    } // end of the chooseTaxGroup method

    private static double computeTax(double taxable, char group) {

        if (group == 'S' || group == 'Q') {
            return HIGH_RATE * taxable;
        }
        else if (group == 'M') {
            return MEDIUM_RATE * taxable;
        }
        else if (group == 'A' || group == 'R') {
            return LOW_RATE * taxable;
        }
        else if (group == 'P') {
            return 0.0;
        }
        else {
            System.out.println("Error!");
            return 0.0;
        }

    } // end of the computeTax method

    private static void displayTaxInformation(double income, double deductions, double taxableIncome, char group, double tax) {

        System.out.println("Income         = " + income);
        System.out.println("Deductions     = " + deductions);
        System.out.println("Taxable income = " + taxableIncome);
        System.out.println("Tax group      = " + group);
        System.out.println("Tax owed       = " + tax);

    } // end of the displayTaxInformation method


    public static void main(String[] args) {

        double inputAmount, income, deductions, taxableIncome, taxOwed;
        char taxGroup;

        System.out.println("Enter next amount: ");
        inputAmount = keyboard.nextDouble();

        income = 0.0;
        deductions = 0.0;

        while (inputAmount != 0) {

            if (inputAmount > 0) {
                income = income + inputAmount;
            }
            else {
                deductions = deductions - inputAmount;
            }

            System.out.println("Enter next amount: ");
            inputAmount = keyboard.nextDouble();

        } // end of the while loop

        taxableIncome = computeTaxableIncome(income, deductions);
        taxGroup = chooseTaxGroup(taxableIncome);
        taxOwed = computeTax(taxableIncome, taxGroup);
        displayTaxInformation(income, deductions, taxableIncome, taxGroup, taxOwed);

    } // end of the main method

} // end of the KingTax class
