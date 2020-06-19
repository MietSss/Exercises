package BMIoefeningen;

import java.util.*;

/**
 * @author Miet Smets
 * @version 1.0 17/06/20 15:46
 */


public class BMI {

        public static double readLength() {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Geef je lengte in cm.");
                double length = keyboard.nextDouble() / 100;
                while (length <50 || length > 250){
                        System.out.println("Foutieve waarde");
                        System.out.println("Geef je lengte in cm");
                        length = keyboard.nextDouble()/100;
                }
                return length;
        }

        public static double readWeight() {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Geef me jouw gewicht in kg");
                double weight = keyboard.nextDouble();
                while (weight<10 || weight > 300){
                        System.out.println("Foutieve waarde");
                        System.out.println("Geef je gewicht in kg");
                        weight = keyboard.nextDouble();
                }
                return weight;
        }

        //BMI berekenen
        public static double calculateBMI(double length, double weight) {
                double BMI = weight / (length * length);
                double ResultBMI = Math.round(BMI);
                return ResultBMI;
        }

        //resultaat BMI
        public static void printBMI(double ResultBMI) {
                if (ResultBMI < 18) {
                        System.out.println("Je BMI is " + ResultBMI + " Dat is ondergewicht");
                } else if (ResultBMI <= 25) {
                        System.out.println("Je BMI is " + ResultBMI + " Dat is een normaal gewicht");
                } else if (ResultBMI <= 30) {
                        System.out.println("Je BMI is " + ResultBMI + " Je hebt overgewicht. Je loopt nog geen risico maar je mag niet dikker worden");
                } else if (ResultBMI <= 40) {
                        System.out.println("Je BMI is " + ResultBMI + " Je bent zwaarlijvig. je hebt een verhoogde kans op allerlei aandoeningen.");
                } else
                        System.out.println("Je BMI is" + ResultBMI + " Je bent ernstig zwaarlijvig. Je leven is in gevaar");
        }
}




