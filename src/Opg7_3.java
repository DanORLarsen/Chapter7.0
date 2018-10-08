////////////////////////////////////
//      \\/////--\\\\\\\|    \\|  ||
//  ||   \\///    \\\\\\|     \|  ||
//  |||  ||//  /_\ \\\\\|  |\  |  ||
//  ||  ////        \\\\|  |\\    ||
//_____////__/_____\__\\|  |\\\___||
////////////////////////////////////
import java.util.Scanner;

public class Opg7_3 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        System.out.print("(Enter 0 to end ints) Enter the ints between 1 and 100: ");
//Counts the occurrences of the numbers
        count(numbers);

        //I use the 100 max of my numbers to count and write the numbers down.
        //It means at index 40 will there be how many 41 is repeated. and so on. Its possible cause those with nothing is just 0.
        //and because i made the array to 100...
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0)

                System.out.println((i + 1) + " occurs " + numbers[i] +

                        " time" + (numbers[i] > 1 ? "s" : ""));//If more than one add s, else add nothing.

        }
    }

    //Method to count numbers and end at 0.
    //With adding increased number to a 0 array, if 41 is metioned 3 times. index 40 would be 3.
    public static void count(int[] numbers){

        Scanner input = new Scanner(System.in);

        int num;

        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100)
                 numbers[num - 1]++;
        } while (num != 0);

    }

}