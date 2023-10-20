import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a value: ");
		int a = sc.nextInt();
		String op =(a%2==0)?"Even":"Odd";
		System.out.println(""+op);
	}
}