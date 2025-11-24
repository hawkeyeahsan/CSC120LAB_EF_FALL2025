import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> myArray = new ArrayList<>();

        int index;
        for (index = 0; index < 5; index++) {
            System.out.println("Enter an integer: ");
            myArray.add(keyboard.nextInt());
        }

        ObjectOutputStream toStream = null;

        try {
            toStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ahsan\\CSC120LAB_EF_FALL2025\\Final Project\\FleetData.db"));

            for (index = 0; index < myArray.size(); index++) {
                toStream.writeObject(myArray.get(index));
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (toStream != null) {
                try {
                    toStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing " + e.getMessage());
                }
            }
        }

        ObjectInputStream fromStream = null;
        Integer myNumber;

        try {

            fromStream = new ObjectInputStream(new FileInputStream("C:\\Users\\ahsan\\CSC120LAB_EF_FALL2025\\Final Project\\FleetData.db"));

            myNumber = (Integer) fromStream.readObject();
            while (myNumber != null) {
                System.out.println(myNumber.intValue());
                myNumber = (Integer) fromStream.readObject();
            }

        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (fromStream != null) {
                try {
                    fromStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing " + e.getMessage());
                }
            }
        }

    } // end of the main method

} // end of the Practice class
