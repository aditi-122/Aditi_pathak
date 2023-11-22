import java.util.Scanner;
class SpyNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int pro = 1;
		int sum = 0;
		while(n>0)
		{
		  int rem = n%10;
		  sum+=rem;
		  pro*=rem;
		  n/=10;
		}
		System.out.println(sum==pro?"Spy Number":"Not a Spy Number");
	}
} 
