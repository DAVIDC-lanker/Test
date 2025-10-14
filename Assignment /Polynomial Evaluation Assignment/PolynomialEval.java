import java.util.StringTokenizer;
import java.util.Scanner;

public class PolynominalEval {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your function: ");
        String fXfunc = keyboard.nextLine();
        System.out.println("Pleasse enter your x value: ");
        String xVal = keyboard.nextLine();

        double total = 0;

        StringTokenizer takeApart = new StringTokenizer(fXfunc.substring(5), " ");

        do {
            String variable = takeApart.nextToken();
            StringTokenizer number = new StringTokenizer(variable, "+");
            String token = number.nextToken();

            if (token.contains("x")) {
                double exponent = Double.parseDouble(token.substring(token.indexOf("^") + 1));
                double termPow = Math.pow(Double.parseDouble(xVal), exponent);
                double coefficent = Double.parseDouble(token.substring(0, token.indexOf("x")));
                total += coefficent * termPow;
            } else {
                total += Double.parseDouble(token);
            }
        } while (takeApart.hasMoreTokens());
        System.out.println("Your input value is: " + total);
        keyboard.close();
    }
}
