import java.util.Scanner;
class NeonNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int usrnum =sc.nextInt();
		int num = usrnum*usrnum;
		int sum =0;
		while(num!=0)
		{
			int rem = num%=10;
			sum+=rem;
			num/=10;
		}
		System.out.println(sum==usrnum?"Neon number":"Not a neon number");
	}
}