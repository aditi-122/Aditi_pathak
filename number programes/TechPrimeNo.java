import java.util.Scanner;
class TechPrimeNo
{
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	int num = sc.nextInt();
  	int dup = num;
  	int cnt = 0;
  	while(dup!=0)
  	{
       cnt++;
       dup/=10;
  	}
  	if(cnt%2==0)
  	{
  		int div = 1;
  		for(int i=1;i<cnt/2;i++)
  		{
  			div*=10;
  		}
  		int dup1 = dup/div;
  		int dup2 = dup%div;
  		int sum = dup1+dup2;
  		int sqr = sum*sum;
  		for(int j=2;j<sqr;j++)
  		{ int c = 0;
  			if(sqr%j==0)
  			{
  				cnt++;
  				break;
  			}
  			System.out.println((cnt==0 && sqr!=1)?"Tech Prime":"Not a Tech Prime");
  		}
  	}
  	else
  	{
  		System.out.println("Not a tech prime");
  	}
    else
    {
      System.out.println("tech prime");
    }
  }
}