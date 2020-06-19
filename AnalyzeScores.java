package Arrays.OefeningLiang1;
import java.util.*;
/**
 * @author Miet Smets
 * @version 1.0 18/06/20 22:41
 */
//7.4 Analyze scores blz 301
public class AnalyzeScores {
    public static void main(String[] args) {

        int lengthArray = readLengthArray();
        int [] scores = new int[lengthArray];
       // scores[i] = inputAndSumInput(lengthArray);
        int sumScores = inputAndSumInput(lengthArray, scores);
        int average = sumScores/lengthArray;
        printAverage(average, lengthArray,scores);


    }

    public static int readLengthArray() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give the number of scores you want to add:");
        int length = keyboard.nextInt();
        return length;
    }

    public static int inputAndSumInput(int lengthArray, int[] scores) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter all the scores"); //enter scores
        int sum = 0;
        for (int eachScore: scores) {
            eachScore = keyboard.nextInt();
            while (eachScore > 100 || eachScore< 0) {
                System.out.println("Wrong input");
                System.out.println("Give me you score");
                eachScore = keyboard.nextInt();
            }
            sum += eachScore;

        }
        return sum;
    }
    private static void printAverage(int average, int lengthArray, int[] scores) {


        int belowAverage=0;
        int sameAsAverage=0;
        int aboveAverage=0;


        for(int eachScore: scores){

            if(eachScore<average){
            belowAverage++;
            }
            if(eachScore>average){
            aboveAverage++;
            }
            else
            sameAsAverage++;
        }
        System.out.println("The average score is "+ average);
        System.out.println(belowAverage+" scores are below average");
        System.out.println(sameAsAverage+" scores are the same as the average");
        System.out.println(aboveAverage+" scores are above average.");
        }

}
