import java.util.Scanner;
class VowelCon
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any charater: ");
		char op = sc.next().charAt(0);
		if(op=='a' || op=='A')
		{
			System.out.println("entered charater is vowel");
		}
		else if(op=='e' || op=='E')
		{
			System.out.println("entered Character is vowel");
		}
		else if(op=='i' || op=='I')
		{
			System.out.println("entered charater is vowel");
		}
		else if(op=='o' || op=='O')
		{
			System.out.println("entered charater is vowel");
		}
		else if(op=='u' || op=='U')
		{
			System.out.println("entered charater is vowel");
		}
		else
		{
			System.out.println("entered char is consonant");
		}
	}
}