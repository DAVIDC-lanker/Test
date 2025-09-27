import java.util.Scanner;

public class ambigousCase {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("give a side length: ");
        double sideA = keyboard.nextDouble();

        System.out.println("give another side length: ");
        double sideB = keyboard.nextDouble();

        System.out.println("give an angle: ");
        double angleA = keyboard.nextDouble();

        double height = sideB * Math.sin(angleA);
        
        // if else cases for triangle types //
        if (angleA < 90) {
            if (sideA < height) {
                System.out.println("no triangle");
            } else if (sideA == height) {
                System.out.println("right triangle");
            } else if (sideA > sideB) {
                System.out.println("one triangle");
            } else if (height < sideA && sideA < sideB) {
                System.out.println("two triangles (ambigous case)");
            }
        } else {
            if (sideA < sideB || sideA == sideB) {
                System.out.println("no triangle.");
            } else if (sideA > sideB) {
                System.out.println("one triangle.");
            }
        }
        
        keyboard.close();
    }
}
