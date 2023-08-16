import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user to enter the elements of the array
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // Display a menu and ask the user to choose an option
        System.out.println("1. Sum of all elements");
        System.out.println("2. Sum of alternate elements");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        // Call the appropriate function based on the user's choice
        switch (choice) {
            case 1:
                int sum = sumOfAllElements(arr);
                System.out.println("Sum of all elements = " + sum);
                break;
            case 2:
                int altSum = sumOfAlternateElements(arr);
                System.out.println("Sum of alternate elements = " + altSum);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
    // Function to calculate the sum of all elements in the array
    public static int sumOfAllElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        return sum;
    }
    // Function to calculate the sum of alternate elements in the array
    public static int sumOfAlternateElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
}
