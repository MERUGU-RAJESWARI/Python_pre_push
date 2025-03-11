[3:00 PM, 3/11/2025] Anu ✨: import java.util.Scanner;

public class Anusha {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Performing addition
        int sum = add(num1, num2);

        // Displaying the result
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}