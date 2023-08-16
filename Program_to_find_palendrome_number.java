import java.util.Scanner;
 
public class Pal
{
	public static void main(String[] args)
	{
		int n, b, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Palindrome No N:");
		int N = sc.nextInt();
		System.out.print("Palindrome numbers from 1 to N:");
		for (int i = 1; i <= N; i++)
		{
			n = i;
			while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			if (rev == i)
			{
				System.out.print(i + " ");
			}
			rev = 0;
		}
	}
 
}