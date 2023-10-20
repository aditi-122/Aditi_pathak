import java.util.Scanner;
class Charater
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a Charater: ");
		char ch = sc.next().charAt(0);
		String op =((ch>=65 && ch<=90)||(ch>=97 && ch<=122))?(ch>=97 && ch<=122?"LowerCase":"UpperCase"):"Not a alphaet";
		System.out.println(op);

	}
}