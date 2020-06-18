package Arrays.OefeningLiang1;
import java.util.*;
/**
 * @author Miet Smets
 * @version 1.0 18/06/20 15:58
 */


public class DiagonalAverage {
    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
       // double averageMajorDiagonal = DiagonalAverage.averageMajorDiagonal();
   // }

    //public static double averageMajorDiagonal(double[][] matrix) {
        System.out.println("Geef de getallen voor de matrix in");
        for (int i = 0; i < matrix.length; i++) {
            Scanner input = new Scanner(System.in);
            matrix = new double[matrix.length];
            row[i] = input.nextDouble();
            System.out.println();

            for (int j = 0; j < matrix[i].length; j++) {
                double [] col = new double[matrix[i].length];
                col[j] = input.nextDouble();
                System.out.println();



            }

//berekenen diagonaal
          //  double averageMajorDiagonal =  matrix[0][0]+ matrix [1][1] + matrix [2][2] + matrix [3][3]
        }

    }
}






