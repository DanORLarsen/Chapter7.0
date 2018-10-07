import java.util.Scanner;

public class Opg7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many nunbers you will use: ");
        int howManyNumbers = sc.nextInt();
    int[] numbers = new int[howManyNumbers];
        for (int l = 0; l < numbers.length; l++)
        { System.out.print("Enter one number/Another: ");
            numbers[l]=sc.nextInt();
            System.out.println("Number " + (l+1) + " got the value of " + numbers[l]);}






    }
}
