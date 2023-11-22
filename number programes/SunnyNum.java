import java.util.Scanner;
class SunnyNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 	System.out.print("enter a number: ");
        int num = sc.nextInt();
        int b=num+1;
        int sqrt = 0;
        for(i=1;i<=num/2;i++)
        {
        	if(i*i==b)
        	{
        		sqrt=i;
        		break;
        	}
        	System.out.println(sqrt>0?"Sunny Number":"Not a Sunny Number");
        }
	}
}