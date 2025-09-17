import java.util.Scanner;

public class HeronsFormula2 {
    public static void main(String[] args) throws Exception {
        // explain program's desired goal //
        System.out.println("This program will: ");
        System.out.println("1. Prompt user for input lengths, a, b, and c; ");
        System.out.println("2. Calculate, using Heron's formula, a triangle's area; ");
        System.out.println("3. Print area in nonspecific units, for user's output. \n");
        Thread.sleep(1500);
        // wait before prompt // 
        Scanner keyboard = new Scanner(System.in);
        // ask user for valuable imputs // 
        System.out.println("Give the length a (units): ");
        double lengthA = keyboard.nextDouble();
        System.out.println("Give the length b (units): ");
        double lengthB = keyboard.nextDouble();
        System.out.println("Give the length c (units): ");
        double lengthC = keyboard.nextDouble();
        // calculate area // 
        double Area = 0.25 * Math.sqrt(4 * (lengthA * lengthA) * (lengthB * lengthB)
                - Math.pow((lengthA * lengthA) + (lengthB * lengthB) - (lengthC * lengthC), 2));
        // print Area for output //
        System.out.println("Your area is: " + Area + " units");
        keyboard.close();
    }

}
