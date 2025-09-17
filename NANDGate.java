import java.util.Scanner;

public class NANDGATE {

    public static void main(String[] args) {
        // explain // 
        System.out.println("This program will simulate a 'ANDGate', however, it shall be reversed to a 'NANDGate'.");
        // simple keyboard scanner // 
        Scanner keyboard = new Scanner(System.in);
        // define variables //
        boolean a = false;
        boolean b = false;
        boolean c = false;
        // user imputs // 
        System.out.println("Give a true or false: ");
        a = keyboard.nextBoolean();

        System.out.println("Give another true or false: ");
        b = keyboard.nextBoolean();
        // depend on a & b for c // 
        c = !(b && a);
        // print result done! // 
        System.out.println("Final result: " + c);

        keyboard.close();

    }
}
