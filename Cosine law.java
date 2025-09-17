import java.util.Scanner;

    public class CosineLaw {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("give a side length: ");
            double sideB = keyboard.nextDouble();
            
            System.out.println("give another side length: ");
            double sideC = keyboard.nextDouble(); 

            System.out.println("give an angle: ");
            double angleA = keyboard.nextDouble(); 

            double B = Math.asin((sideB * angleA)/sideC);
            
            double angleB = 180 - B;

            double C = 180 - angleA - angleB;
            
            double sideA = (Math.sin(C)/Math.sin(angleA))*sideC;

            System.out.println("here is your side length: "+sideA);
            keyboard.close();
            ;

                
        }
    }


