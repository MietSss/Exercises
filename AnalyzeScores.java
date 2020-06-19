package Arrays.OefeningLiang1;
import java.util.*;
/**
 * @author Miet Smets
 * @version 1.0 18/06/20 22:41
 */
//7.4 Analyze scores blz 301
public class AnalyzeScores {
    public static void main(String[] args) {

        int lengthArray = readLengthArray();                                        // input amount of scores
        int [] scores = new int[lengthArray];                                       // making the array
       // scores[i] = inputAndSumInput(lengthArray);
        int sumScores = inputAndSumInput(lengthArray, scores);                      // inout several scores and calculate sum
        int average = sumScores/lengthArray;                                        // calculate average
        printAverage(average, lengthArray,scores);                                  // looping the scores and marking them as abow, below or same as average


    }

    public static int readLengthArray() {                                           // ask input of amount of scores
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give the number of scores you want to add:");
        int length = keyboard.nextInt();
        return length;
    }

    public static int inputAndSumInput(int lengthArray, int[] scores) {                 // input for each score and calculate the sum of the scores
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter all the scores"); //enter scores
        int sum = 0;
        for (int eachScore: scores) {
            eachScore = keyboard.nextInt();
            while (eachScore > 100 || eachScore< 0) {                                   // validate input
                System.out.println("Wrong input");
                System.out.println("Give me you score");
                eachScore = keyboard.nextInt();
            }
            sum += eachScore;

        }
        return sum;
    }
    private static void printAverage(int average, int lengthArray, int[] scores) {              //determine if score is below, aboce or same as average


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
        System.out.println("The average score is "+ average);                               // print the result
        System.out.println(belowAverage+" scores are below average");
        System.out.println(sameAsAverage+" scores are the same as the average");
        System.out.println(aboveAverage+" scores are above average.");
        }

}