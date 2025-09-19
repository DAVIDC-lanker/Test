import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a [true/false]: ");
        boolean A = keyboard.nextBoolean();
        System.out.println("Enter b [true/false]: ");
        boolean B = keyboard.nextBoolean();
        System.out.println("Enter c [true/false]: ");
        boolean C = keyboard.nextBoolean();
        System.out.println("Enter d [true/false]: ");
        boolean D = keyboard.nextBoolean();
        // parentheses for brackets, dot for AND ∧, plus for OR ∨, dash over for NOT ¬
        //
        boolean a = (B && (!D)) || ((!B) && (!C) && D) || ((!A) && (!B) && (!C) || (A && C && (!D)));
        // print final result // 
        System.out.print("Value output: " + a);

        keyboard.close();
    }
}
