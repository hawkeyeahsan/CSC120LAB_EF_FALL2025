import java.util.ArrayList;

public class IntegerValidator {

    public static void main(String[] args) {

        ArrayList<Integer> validIntegers = new ArrayList<>();

        int index;
        for (index = 0; index < args.length; index++) {

            try {
                Integer convertedNumber = converter(args[index]);
                validIntegers.add(convertedNumber);
            }
            catch (NumberFormatException error) {
                System.out.println("Catch block says the argument \"" + args[index] + "\" is ignored because " + args[index]);
            }

        } // end of the for loop

        System.out.println();
        System.out.println("The ArrayList contents are:");
        for (index = 0; index < validIntegers.size(); index++) {

            System.out.println("Item " + index + " is " + validIntegers.get(index));

        } // end of the for loop

    } // end of the main method

    public static Integer converter(String givenNumberString) throws NumberFormatException {

        int integerValue = Integer.parseInt(givenNumberString);
        System.out.println("Converter method says integer OK - " + integerValue);

        Integer integerObject = integerValue;
        return integerObject;

    } // end of the converter method

} // end of the IntegerValidator class
