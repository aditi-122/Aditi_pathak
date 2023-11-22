import java.util.Scanner;
class TechNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
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
				for(int i=0;i<cnt/2;i++)
				{
                  div*=10;
				}
				int dup1 = num/div;
				int dup2 = num%div;
				int sum = dup1+dup2;
				int sqr = sum*sum;
				System.out.println(sqr==num?"Tech number":"Not a Tech Number");
			}        
    }
}