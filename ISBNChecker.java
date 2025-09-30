import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        //initiate necessary variables
        boolean tryAgain = true;
        int total = 0;
        // main loop consisting of prompting, calc, and validation
        do {
            // ISBN user input
            System.out.println("Give a ISBN code: ");
            String x = keyboard.next();
            // check if user input is valid
            if (x.length() > 12) {
                // if valid proceed with calculation [even or odd]
                for (int i = 0; i <= 12; i++) {
                    if (i % 2 != 0) {
                        int oddDigit = (x.charAt(i) - '0') * 3;
                        total += oddDigit;
                    } else {
                        int evenDigit = x.charAt(i) - '0';
                        total += evenDigit;
                    }
                }
                // check if ISBN is valid
                if (total % 10 == 0) {
                    System.out.println("your ISBN: " + x + " is indeed valid!");
                } else {
                    System.out.println("that is NOT a valid ISBN; making it up! >:(");
                }
                // not valid skips loop
            } else {
                System.out.println("that is INVALID! Not 13 characters.");
            }
            // tryAgain method
            System.out.println("do you want to try again? [true/false]: ");
            tryAgain = keyboard.nextBoolean();
        } while (tryAgain);
        keyboard.close();
    }

}
