//write a java programe to find a prime factor.
import java.util.Scanner;
 class PrimeFactor
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a nuber: ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			  int num1 = i;
			  int cnt=0;
			  for(int j=2;j<num;j++)
			  {
			  	if(num1%j==0)
			  	{
			  		cnt++;
			  		break;
			  	}
			  	 
			  }
			 
			}
			
		}
		System.out.println(cnt==0 && num1>1?"PrimeFactor":"Not a prime Factor");
	}
}