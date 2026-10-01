import java.util.Scanner;

public class IT24103837Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        String numbers = "";
        long sum = 0;

        System.out.println("Please enter 10 numbers:");
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();
            if (count > 1) {
                numbers += " ";
            }
            numbers += number;
            sum += number;
            count++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
        double average = sum / 10.0;
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}
