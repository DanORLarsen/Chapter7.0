import java.util.Scanner;
////////////////////////////////////
//      \\/////--\\\\\\\|    \\|  ||
//  ||   \\///    \\\\\\|     \|  ||
//  |||  ||//  /_\ \\\\\|  |\  |  ||
//  ||  ////        \\\\|  |\\    ||
//_____////__/_____\__\\|  |\\\___||
////////////////////////////////////
//(Reverse an array) The reverse method in Section 7.7 reverses an array by copying it to a new array.
// Rewrite the method that reverses the array passed in the argument and returns this array.
// Write a test program that prompts the user to enter ten numbers,
// invokes the method to reverse the numbers, and displays the numbers.



public class Opg7_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many ints you wanna use: ");
        int howManyNumbers = sc.nextInt();

        int[] wank = new int[howManyNumbers];
        for (int d = 0; d < howManyNumbers;d++)
        {
            System.out.print("Enter an int: ");
            wank[d] = sc.nextInt();}
        for (int d = 0; d < howManyNumbers;d++)
        {
            System.out.println("Index " + d + " in the array got the value: " + wank[d]);}
        System.out.println("Hokus pokus swap");
        //Swapping numbers
            reverseInt(wank);
        for (int d = 0; d < howManyNumbers;d++)
        {
            System.out.println("Index " + d + " in the array now, got the value: " + wank[d]);}



    }
    public static void reverseInt(int[] swap) {
        int[] temp = new int[swap.length];
        int b = (swap.length - 1);
        for (int a = 0; a < swap.length; a++) {
            temp[a] = swap[b];
            b--;
        }
        for (int c = 0; c < swap.length; c++) {
            swap[c] = temp[c];
        }}}