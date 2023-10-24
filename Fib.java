import java.util.Scanner;
class fib
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		long num1 = sc.nextInt();
		System.out.print("enter second number: ");
		long num2 = sc.nextInt();
		System.out.println(num1+" "+num2+" ");
		for(int i = 1;i<=100;i++)
		{
			long op = num1+num2;
			num1 = num2;
			num2 = op;
		}
	}
}