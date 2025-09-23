//=============================================================================

import java.util.Scanner;

public class GasLaw {
    //-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    //----The gas constant in Joules/mole/K
    private static final double GAS_CONSTANT = 8.3143;

    //-----------------------------------------------------------------------------
    public static void main(String[] args) {

        //----Variables to hold system values
        double volume;
        double pressure;
        double temperature;
        double moles;

        //----Getting the values
        System.out.print("Enter volume, moles, temperature : ");
        volume = keyboard.nextDouble();
        moles = keyboard.nextDouble();
        temperature = keyboard.nextDouble();

        //----Calculating the result
        pressure = moles * GAS_CONSTANT * temperature / volume;

        //----Output the result
        System.out.println("Pressure is " + pressure);

    } // end of the main method

} // end of the GasLaw class
//-----------------------------------------------------------------------------
//=============================================================================
