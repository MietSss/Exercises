package Arrays.OefeningLiang1;

import java.util.Scanner;

/**
 * @author Miet Smets
 * @version 1.0 18/06/20 23:19
 */
public class ScoreAnalysis {


//7.4 Analyze scores blz 301
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("How many scores do you want to enter:");
            int lengthArray= keyboard.nextInt();
            int sum = 0;
            int[] scores = new int[lengthArray]; // array

            System.out.println("Enter all the scores"); //enter scores

            for(int i = 0; i<lengthArray; i++){
                scores[i] = keyboard.nextInt();
                while(scores[i]>100 || scores[i]<0){
                    System.out.println("Wrong input");
                    System.out.println("Give me you score");
                    scores[i] =keyboard.nextInt();
                }
                sum += scores[i];
            }

            int average = sum/lengthArray;
            int belowAverage = 0;
            int sameAsAverage =0;
            int aboveAverage = 0;

            for(int i = 0; i<lengthArray; i++){
                if(scores[i]<average){
                    belowAverage++;;
                }
                else
                if(scores[i]>average){
                    aboveAverage++;
                }
                else
                    sameAsAverage++;

            }
            System.out.println("The average score is " + average);
            System.out.println(belowAverage +" scores are below average");
            System.out.println(sameAsAverage+ " scores are the same as the average");
            System.out.println(aboveAverage+ " scores are above average.");


        }
    }




