package Arrays.OefeningLiang1;
import java.util.*;
/**
 * @author Miet Smets
 * @version 1.0 18/06/20 22:41
 */
//7.4 Analyze scores blz 301
public class AnalyzeScores {
    public static void main(String[] args) {


        int [] scores = new int[readLengthArray()];                                       // making the array
       // scores[i] = inputAndSumInput(lengthArray);
        int sumScores = inputAndSumInput(scores);                      // inout several scores and calculate sum
        int average = sumScores/scores.length;                                        // calculate average
        printAverage(average,scores);                                  // looping the scores and marking them as abow, below or same as average


    }

    public static int readLengthArray() {                                           // ask input of amount of scores
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give the number of scores you want to add:");
        int length = keyboard.nextInt();
        return length;
    }

    public static int inputAndSumInput(int[] scores) {                 // input for each score and calculate the sum of the scores
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter all the scores"); //enter scores
        int sum = 0;
        for (int i = 0; i< scores.length; i++) {
            scores[i] = keyboard.nextInt();
            while (scores[i] > 100 || scores[i]< 0) {                                   // validate input
                System.out.println("Wrong input");
                System.out.println("Give me you score");
                scores[i] = keyboard.nextInt();
            }
            sum += scores[i];

        }
        return sum;
    }
    private static void printAverage(int average, int[] scores) {              //determine if score is below, aboce or same as average


        int belowAverage=0;
        int sameAsAverage=0;
        int aboveAverage=0;


        for(int eachScore: scores){

            if(eachScore<average){
            belowAverage++;
            }
            else if(eachScore>average){
            aboveAverage++;
            }
            else{
            sameAsAverage++;}
        }
        System.out.println("The average score is "+ average);                               // print the result
        System.out.println(belowAverage+" scores are below average");
        System.out.println(sameAsAverage+" scores are the same as the average");
        System.out.println(aboveAverage+" scores are above average.");
        }

}
