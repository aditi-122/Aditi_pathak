import java.util.Scanner;
class FirstDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the digits:");
		int num1 = sc.nextInt();
		int num = num1/10;
		System.out.println("enter any 3 digit number"+num1+"is"+num);
	}
}