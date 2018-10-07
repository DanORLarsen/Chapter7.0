import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;


public class Opg7_1 {
    public static void main(String[] args) {
        System.out.print("Enter number of students: ");
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        System.out.println();
        int[] scores = new int[students];
        for (int l = 0; l < scores.length; l++)
        { System.out.print("Enter " + students + " scores: ");
        scores[l]=sc.nextInt();}

        Arrays.sort(scores);
        String[] grade = new String[scores.length];
        int bestScore = scores[(scores.length-1)];
        System.out.println(bestScore);
        for (int i = 0;i<students;i++)
        {if (scores[i] >= bestScore - 10)
            {grade[i]= "A";}
        else if (scores[i] >= bestScore -20)
        {grade[i] = "B";}
        else if (scores[i] >= bestScore -30)
        {grade[i] = "C";}
        else if (scores[i] >= bestScore -40)
        {grade[i] = "D";}
        else
        {grade[i] = "F";}}

        for (int p = 0; p < students;p++)
        {
        System.out.println("The student with the score of " + scores[p] + " got the grade: " + grade [p]);}


    }


}
