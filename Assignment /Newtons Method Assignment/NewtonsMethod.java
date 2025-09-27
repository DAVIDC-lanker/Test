import java.util.Scanner;

public class NewtonsMethod {
    public static void main(String[] args) {
        System.out.println("This is Newton's Method. \n");

        Scanner keyboard = new Scanner(System.in);
        // define necessaries //
        double xPrime;
        Boolean tryAgain = true;
        // user input and mathemathical computation //
        do {
            System.out.println("Provide an initial guess as of the root: ");
            double xNaught = keyboard.nextDouble();
            // compute xPrime with given xNaught //
            equation: do {
                double fX = 6 * Math.pow(xNaught, 4) - 13 * Math.pow(xNaught, 3) - 18 * Math.pow(xNaught, 2)
                        + 7 * xNaught + 6;
                double fXprime = 24 * Math.pow(xNaught, 3) - 39 * Math.pow(xNaught, 2) - 36 * xNaught + 7;
                xPrime = xNaught - fX / fXprime;
                System.out.println(xPrime);
                // check if difference is close to actual root //
                if (Math.abs(xNaught - xPrime) < 0.00001) {
                    System.out.println("\nfound root approx at " + xPrime);
                    break equation;
                }
                // set previous xPrime to the new xNaught to run again //
                xNaught = xPrime;
            } while (true);
            // check if user wants to tryAgain after difference check was true //
            System.out.println("\nDo you wanna try again? [true/false]");
            tryAgain = keyboard.nextBoolean();
        } while (tryAgain);
        keyboard.close();
    }
}
