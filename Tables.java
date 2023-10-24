import java.util.Scanner;
class Tables
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		int i = 1;
		System.out.print("enter your range: ");
		int range = sc.nextInt();
		while(i<=range)
		{
			System.out.println(num+"*"+i+"="+num*i);
			i++;
			}
       
	}
}