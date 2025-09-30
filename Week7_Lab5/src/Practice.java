public class Practice {

    public static void main(String[] args) {

        System.out.println("WEEK 7 - LAB 5 Practice");

        //System.out.println(isPrime(10));

        System.out.println(isFibonacci(14));

    } // end of the main method

    public static boolean isPrime(int candidate) {

//        int divisor;
//
//        for (divisor = 2; divisor < givenNumber; divisor++) {
//
//            if (givenNumber % divisor == 0) {
//
//                return false;
//
//            }
//
//        } // end of the for loop
//
//        return true;

        long divisor = 2;

        while (divisor <= Math.sqrt(candidate)) {
            if (candidate % divisor == 0) {
                System.out.println(candidate + " is divisible by " + divisor);
                return(false);
            }
            divisor++;
        }
        return(true);

    } // end of the isPrime method


    public static boolean isFibonacci(int givenNumber) {

        int previous = 0;
        int current = 1;

        int index;
        int next;

        for (index = 0; index < givenNumber; index++) {

            next = previous + current;

            if (next == givenNumber) {

                return true;

            }

            previous = current;
            current = next;

        } // end of the for loop

        return false;

    } // end of the isFibonacci method


} // end of the Practice class
