public class PracticeMethod {

    public static void main(String[] args) {

        System.out.println("Week 6 - Lab 4 Practice");
        // showStudentInformation("Ahsan", "Data Science and AI");

        double total = calculateTheSum(10, 20.5);
        System.out.println("The total is: " + total);

    } // end of the main method


    private static void showStudentInformation() {

        System.out.println("Student name: Ahsan");
        System.out.println("Student major: Data Science and AI");

    } // end of the showStudentInformation method

    private static void showStudentInformation(String name, String major) {

        System.out.println("Student name: " + name);
        System.out.println("Student major: " + major);

    } // end of the showStudentInformation method

    private static double calculateTheSum(double firstNumber, double secondNumber) {

        double result;
        result = firstNumber + secondNumber;
        return result;

    } // end of the calculateTheSum method

} // end of the PracticeMethod class
