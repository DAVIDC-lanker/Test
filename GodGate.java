
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Here is a gate system of true and falses!");
        
        Scanner keyboard = new Scanner(System.in);

        // define all variables //
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        // ask user for imputs [t/f] //
        System.out.print("define true or false a: ");
        a = keyboard.nextBoolean();
        System.out.print("define true or false b: ");
        b = keyboard.nextBoolean();
        System.out.print("define true or false c: ");
        c = keyboard.nextBoolean();
        System.out.print("define true or false d: ");
        d = keyboard.nextBoolean();
        // first gate layer //
        boolean gate1 = a && b;
        boolean gate2 = c && d;
        boolean gate3 = a && c;
        boolean gate4 = a && d;
        boolean gate5 = b && d;
        boolean gate6 = c && b;
        // second gate layer //
        boolean gate21 = gate1 && gate2;
        boolean gate22 = gate3 && gate4;
        boolean gate23 = gate5 && gate6;
        // third gate layer //
        boolean gate31 = gate21 && gate22;
        boolean gate32 = gate22 && gate23;
        // last layer //
        boolean gate41 = gate31 && gate32;
        // output //
        System.out.println("result is: " + gate41);
        
        keyboard.close();
    }
}
