import java.util.Scanner;
class Factor
{
	public static void main(String[] args) {
		Scanner sc = new Sacnner(System.in)
		System.out.print("enter any number: ");
		int num = sc.nextInt();
		for (int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(+i" ");
			}
		}
	}
}