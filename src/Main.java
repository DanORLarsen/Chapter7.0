////////////////////////////////////
//      \\/////--\\\\\\\|    \\|  ||
//  ||   \\///    \\\\\\|     \|  ||
//  |||  ||//  /_\ \\\\\|  |\  |  ||
//  ||  ////        \\\\|  |\\    ||
//_____////__/_____\__\\|  |\\\___||
////////////////////////////////////
public class Main {

    public static void main(String[] args) {
        int marks[] = {10,12,7,4,02};
        String subjects[] = {"Engelsk","Tysk","Fransk","Dansk","Programering"};

        for (int count = 0; count < marks.length;count++)
        {
            System.out.print(subjects[count]+ " = ");
            System.out.println(marks[count]);
    }
        System.out.println("The sum is " + (marks[0]+marks[1]+marks[2]+marks[3]+marks[4]));
}}
