import java.util.Scanner;
public class ArrayIndex 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        // Ask the user to enter the elements of the array
        System.out.println("Enter the elements of the array (10 numbers):");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        // Ask the user to enter a number to search
        System.out.print("Enter a number to search: ");
        int num = scanner.nextInt();
        // Display the elements of the array entered
        System.out.print("The elements of the array are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Find the index of the number in the array
        int index = -1;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        // Display the index of the number or -1 if it's not present
        if (index == -1) {
            System.out.println(num + " is not present in the array.");
        } else {
            System.out.println(num + " is present at index " + index + " in the array.");
        }
    }
}
2