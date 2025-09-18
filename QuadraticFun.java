import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) throws Exception {
        System.out.println("QUADRATIC FORMULA. AND LET'S FIND THOSE ROOTS FOR YOU!~ \n");
        Thread.sleep(1000);
        // simple scanner // 
        Scanner keyboard = new Scanner(System.in);
        // prompt user //
        System.out.println("Give a value: ");
        double a = keyboard.nextDouble();
        System.out.println("Give b value: ");
        double b = keyboard.nextDouble();
        System.out.println("Give c value: ");
        double c = keyboard.nextDouble();
        // discrimination // 
        double discriminant = b * b - 4 * a * c;
        // define expression variable //
        boolean confirmReal = discriminant > 0;
        // see if root is real, a double, or imaginary // 
        switch (confirmReal) {
            case true:
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Real roots located at: " + root1 + "," + root2 + "\n");
                System.out.println("yay!");
                break;
            case false:
                boolean isImaginary = discriminant < 0;
                if (isImaginary == false) {
                    double root = (-b + Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("Double root of: " + root + "\n");
                    System.out.println("Twice the fun!!");    
                }else {
                    System.out.println("No real roots. They are imaginary. \n");
                    System.out.println("Just like your friends.");
                }
                break;
        }
        // close it up // 
        keyboard.close();
    }
}
