import java.util.Scanner;
class MaxNumer
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value: ");
		int a = sc.nextInt();
		System.out.print("enter the second value: ");
		int b = sc.nextInt();
		System.out.print("enter the third Number: ");
		int c = sc.nextInt();
		String op =(a>b)?(a>c?"a is greater":"c is greater"):(b>c?"b is greater":"c is greater");
		System.out.println("enter number is greater: "+op);
	}
}