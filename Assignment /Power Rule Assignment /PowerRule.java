import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Provide the coefficents seperated by a singular space: ");
        String coefficents = keyboard.nextLine();
        String[] coeffs = coefficents.split(" ");

        System.out.println("Provide the degrees in which match the coefficents: ");
        String degrees = keyboard.nextLine();
        String[] degs = degrees.split(" ");

        System.out.print("Your first derivative is: f'(x) = ");

        devLoop: for (int n = 0; n < 2; n++) {
            for (int i = 0; i < degs.length; i++) {
                coeffs[i] = String.valueOf(Double.parseDouble(coeffs[i]) * Double.parseDouble(degs[i]));
                degs[i] = String.valueOf(Double.parseDouble(degs[i]) - 1);
                double coeff = Double.parseDouble(coeffs[i]);
                double deg = Double.parseDouble(degs[i]);

                if (coeff == 0) {
                    break devLoop;
                }
                
                System.out.print((coeff >= 0 ? "+" : "")
                        + (coeff % 1 > 0 ? coeffs[i] : coeffs[i].substring(0, coeffs[i].indexOf(".")))
                        + (deg != 0 ? "x^" : ""));
                System.out.print(
                        (deg != 0 ? (deg % 1 > 0 ? degs[i] : degs[i].substring(0, degs[i].indexOf("."))) + " " : " "));
            }
            System.out.print("\n");
            System.out.print("Your second derivative is: f''(x) = ");
        }
        keyboard.close();
    }
}
