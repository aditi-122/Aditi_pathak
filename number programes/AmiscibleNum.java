import java.util.Scanner;
class AmiscibleNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		int a = sc.nextInt();
		System.out.print("enter a number");
		int b = sc.nextInt();
		int sum = 0;
		int sum1=0;
		for(int i=1;i<b;i++)
			if(b%i==0)
			{
				sum+=i;
			}
        for(int i=1;i<a;i++)
        {
        	if(a%i==0)
        	{
        		sum1+=i;
        	}
        }
        System.out.println(sum==a && sum1==b?"Amsible Number":"Not a Amsible Number");
	}
}