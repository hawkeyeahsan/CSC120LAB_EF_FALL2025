import java.util.Scanner;

public class Driver {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String name;
        Girl girl;
        int carats;
        double value;
        Diamond diamond;
        boolean diamondTaken;

        System.out.print("Enter the name of the girl : ");
        name = keyboard.next();
        // Initializing the Girl object
        girl = new Girl(name);

        System.out.println(girl);

        do {

            System.out.print("Enter carats and value     : ");

            carats = keyboard.nextInt();
            value = keyboard.nextDouble();

            if (carats != 0) {

                // Initializing the Diamond object
                diamond = new Diamond(value, carats);
                diamondTaken = girl.takeDiamond(diamond);

                // Checking if the diamond was taken by the girl or not
                if (diamondTaken) {
                    System.out.println("Woohoo, the girl took the diamond");
                }
                else {
                    System.out.println("Aaargh, the diamond was rejected ");
                }

                System.out.println(girl);

            } // end of the if-else block

        } while (carats != 0);

        System.out.println(girl);

    } // end of the main method

} // end of the Driver class
