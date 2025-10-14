import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynominalFunction {
        public static void main(String[] args) {

                Scanner keyboard = new Scanner(System.in);
                System.out.println("gimme those coefficients, why don't you? ");
                String coefficents = keyboard.nextLine();

                StringTokenizer orderCoef = new StringTokenizer(coefficents, " ");

                double[] arrayCoef = new double[orderCoef.countTokens()];
                int[] intCoef = new int[arrayCoef.length];

                System.out.println("gimme those degrees now boy: ");
                String degrees = keyboard.nextLine();

                StringTokenizer orderDegs = new StringTokenizer(degrees, " ");

                double[] arrayDegs = new double[orderDegs.countTokens()];
                int[] intDegs = new int[arrayDegs.length];

                System.out.println("now now, x value for me: ");
                double x = keyboard.nextDouble();

                double total = 0;

                String function = "f(x) = ";

                for (int i = 0; orderCoef.hasMoreTokens(); i++) {
                        arrayCoef[i] = Double.parseDouble(orderCoef.nextToken());
                        if (arrayCoef[i] % 1 == 0) {
                                intCoef[i] = (int) arrayCoef[i];
                        }
                }

                for (int i = 0; orderDegs.hasMoreTokens(); i++) {
                        arrayDegs[i] = Double.parseDouble(orderDegs.nextToken());
                        if (arrayDegs[i] % 1 == 0) {
                                intDegs[i] = (int) arrayDegs[i];
                        }
                }

                for (int i = 0; i < arrayDegs.length; i++) {
                        // Add to the total
                        total += arrayCoef[i] * Math.pow(x, arrayDegs[i]);
                        // Append term to function string
                        function += (arrayCoef[i] > 0 ? "+" : "")
                                        + (Math.abs(arrayCoef[i] - intCoef[i]) < 1e-9
                                                        ? Integer.toString(intCoef[i])
                                                        : arrayCoef[i])
                                        + "x^" + (Math.abs(arrayDegs[i] - intDegs[i]) < 1e-9
                                                        ? Integer.toString(intDegs[i])
                                                        : arrayDegs[i] + "")
                                        + " ";
                }

                System.out.println("for f(" + (x % 1 == 0 ? Integer.toString((int) x) : Double.toString(x)) + "), total is: " + total + "," 
                                + " and function was " + function);
                keyboard.close();
        }

}
