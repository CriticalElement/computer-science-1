import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class OlympicScoring
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("olympic.txt"));

        int count = scan.nextInt();
        scan.nextLine();
        String[] athletes = new String[count];
        double[] athleteScores = new double[count];

        for (int i = 0; i < count; i++) {
            athletes[i] = scan.next();
            double[] score = new double[7];
            double[] trueScore = new double[5];
            double minScore = Double.MAX_VALUE;
            double maxScore = Double.MIN_VALUE;

            for (int j = 0; j < 7; j++) {
                double curScore = scan.nextDouble();
                score[j] = curScore;
                minScore = Math.min(minScore, curScore);
                maxScore = Math.max(maxScore, curScore);
            }
            int it = 0;
            for (double curScore : score) {
                if (curScore != minScore && curScore != maxScore) {
                    trueScore[it] = curScore;
                    it++;
                }
            }
            double sum = 0;
            for (double point : trueScore) {
                sum += point;
            }
            double average = sum / 5;
            athleteScores[i] = average;
        }

        int maxScoreIndex = 0;
        for (int i = 0; i < count; i++) {
            System.out.println(athletes[i] + String.format(" %.02f", athleteScores[i]));
            maxScoreIndex = Arrays.binarySearch(athleteScores, Math.max(athleteScores[i], athleteScores[maxScoreIndex]));
        }
        System.out.println("Winner: " + athletes[maxScoreIndex]);
    }
}
