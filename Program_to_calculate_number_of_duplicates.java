import java.util.Scanner;
public class Sol {
    public static void main(String[] args) {
        // Ask the user to input the elements of the array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array: ");
        String[] input = sc.nextLine().split("\\s+");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        // Ask the user to input the number to search
        System.out.print("Enter a number to search: ");
        int num = sc.nextInt();
        // Count the occurrence of the number in the array
        int count = 0;
        for (int elem : arr) {
            if (elem == num) {
                count++;
            }
        }
        // Display the frequency of the searched element
        System.out.printf("The number %d appears %d time(s) in the array.", num, count);
    }
}
