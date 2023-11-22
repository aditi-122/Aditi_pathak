import java.util.Scanner;
class fib
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		Long num1 = sc.nextLong();
		System.out.print("enter the sec num: ");
		Long num2 = sc.nextLong(); 
		long num1 = 0;
		long num2 = 1;
		System.out.println(num1+" "+num2+" ");
		for(int i=1;i<=15 ;i++)
		{
			long op = num1+num2;
			System.out.println(op);
			num1 = num2;
			num2 = op;
		}
	}
}