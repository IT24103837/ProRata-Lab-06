import java.util.Scanner;

public class IT24103837Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double square = number * number;
        System.out.println();
        System.out.println("The square of " + number + " is : " + square);
        if (number < 0) {
            System.out.println("The square root is not a real number.");
        } else {
            System.out.println("The square root of " + number + " is : " + Math.sqrt(number));
        }

        input.close();
    }
}
