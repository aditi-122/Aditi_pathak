import java.util.Scanner;
class MagicNum
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		int sum = 0;

		while(a>0||sum>9)
		{
            int num = 1;
			if(num==0)
           {
           	a = sum;
           	sum=0;       	
           }
           int rem = a%10;
           sum+=rem;
           
           	a/=10; 
		} 
		System.out.print(sum);
       System.out.println(sum==1?"Magic Number":"Not a Magic Number");

	}
}
