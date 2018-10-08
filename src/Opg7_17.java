////////////////////////////////////
//      \\/////--\\\\\\\|    \\|  ||
//  ||   \\///    \\\\\\|     \|  ||
//  |||  ||//  /_\ \\\\\|  |\  |  ||
//  ||  ////        \\\\|  |\\    ||
//_____////__/_____\__\\|  |\\\___||
////////////////////////////////////
//(Sort students) Write a program that prompts the user to enter.
// the number of students, the students’ names, and their scores, and prints student names in decreasing order of their scores.

import java.util.Arrays;
import java.util.Scanner;

public class Opg7_17 {
    public static void main(String[] args) {

        //Prompt user to enter number of students
        System.out.print("Enter number of students: ");
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        System.out.println();
        String[] names = new String[students];
        int[] scores = new int[students]; //Use input to limit array
        for (int l = 0; l < scores.length; l++)
        { System.out.print("Enter student name: ");
            names[l]=sc.next();
            System.out.print("Enter " +names[l]+"'s scores: ");
            scores[l]=sc.nextInt();
            } //Use for loop to enter scores of the index student
        int scoresOG[] = new int[students];
        copyArray(scores,scoresOG);

        Arrays.sort(scores); //Sort to find highest (Highest index is highest grade "Problem is that student and scores would be swapped")
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

        for (int p = students; p != 0;p--)
        {for (int l = 0; l < students;l++)
            if(scores[p-1] == scoresOG[l])
            { System.out.println(names[l]);}
            else{}

            System.out.println(" with the score of " + scores[p-1] + " got the grade: " + grade[p-1]);
        }

    }
    public static void copyArray(int[] copyTo,int[]copy) {
        copy = new int[copyTo.length];
        for (int c = 0; c < copy.length; c++) {
            copy[c] = copyTo[c];
        }}
}
