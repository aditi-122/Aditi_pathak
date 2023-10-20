import java.util.Scanner;
class PositiveNegativeZero
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)
		System.out.print("enter any number: ");
		int op = sc.nextInt();
		if(op > 0)
		{
			System.out.println("enter number is positive number ");
		}
		else if(op=0)
		{
			System.out.println("enter number is negative number ");
		}
		else
		{
			System.out.println("entered number is negative ");
		}
	}
}