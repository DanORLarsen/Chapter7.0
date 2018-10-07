import java.util.Scanner;

public class Opg7_3 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        System.out.print("(Enter 0 to end ints) Enter the ints between 1 and 100: ");
//Counts the occurrences of the numbers
        count(numbers);

        //I use the 100 max of my numbers to count and write the numbers down.
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0)

                System.out.println((i + 1) + " occurs " + numbers[i] +

                        " time" + (numbers[i] > 1 ? "s" : ""));//If more than one add s, else add nothing.

        }
    }

    //Method to count numbers and end at 0.
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