import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) throws Exception {
        // explain program's desired goal //
        System.out.println("This program will: ");
        System.out.println("1. Prompt user for input lengths, a, b, and c; ");
        System.out.println("2. Calculate, using Heron's formula, a triangle's area; ");
        System.out.println("3. Print area in nonspecific units, for user's output. \n");
        Thread.sleep(1500);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give the length a (units): ");
        double lengthA = keyboard.nextDouble();
        System.out.println("Give the length b (units): ");
        double lengthB = keyboard.nextDouble();
        System.out.println("Give the length c (units): ");
        double lengthC = keyboard.nextDouble();

        // square variables a, b, c to get a², b², c² //
        double lengthAsquared = Math.pow(lengthA, 2);
        double lengthBsquared = Math.pow(lengthB, 2);
        double lengthCsquared = Math.pow(lengthC, 2);

        // define terms for both 4a²b² and (a² + b² - c²)² //
        double cosTerm = Math.pow(lengthAsquared + lengthBsquared - lengthCsquared, 2);
        double leadTerm = 4 * lengthAsquared * lengthBsquared;

        // calculate Area last //
        double Area = 0.25 * Math.sqrt(leadTerm - cosTerm);

        // print Area for output //
        System.out.println("Your area is: " + Area + " units");
        keyboard.close();
    }

}
