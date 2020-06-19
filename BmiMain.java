package BMIoefeningen;

/**
 * @author Miet Smets
 * @version 1.0 18/06/20 09:20
 */
public class BmiMain {
        public static void main(String[] args) {
            System.out.println("Laat me jouw BM berekenen!");
            double length = BMI.readLength();
            double weight = BMI.readWeight();
            double ResultBMI = BMI.calculateBMI(length, weight);
            BMI.printBMI(ResultBMI);

        }
    }

