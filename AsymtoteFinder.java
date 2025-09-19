import java.util.Scanner;

class AsymtoteFinder {
  public static void main(String[] args) throws Exception {
    System.out.println("This will tell you the aysmtote!");

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Give a 'm' value: ");
    int m = keyboard.nextInt();

    System.out.println("Give a 'n' value: ");
    int n = keyboard.nextInt();

    boolean isRational = true;

    if (isRational == true) {
      if (m == n) {
        System.out.println("Asymtote is horizontal.");
      } else {
        if (n > m) {
          System.out.println("Asymtote is the x-axis.");
        } else {
          int difference = m - n;
          switch (difference) {
          case 1:
            System.out.println("Asymtote is linear.");
            break;
          case 2:
            System.out.println("Asymtote is quadratic.");
            break;
          case 3:
            System.out.println("Asymtote is cubic.");
            break;
          case 4:
            System.out.println("Asymtote is quartic.");
            break;
          case 5:
            System.out.println("Asymtote is quintic.");
            break;
          case 6:
            System.out.println("Asymtote is sextic.");
            break;
          case 7:
            System.out.println("Asymtote is septic.");
            break;
          case 8:
            System.out.println("Asymtote is octic.");
            break;
          case 9:
            System.out.println("Asymtote is nonic.");
            break;
          case 10:
            System.out.println("Asymtote is decic.");
            break;
          }
        }

      }

    }
    keyboard.close();
  }

}
