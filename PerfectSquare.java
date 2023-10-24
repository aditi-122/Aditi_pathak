import java.util.Scanner;
class PerfectSquare
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number: ");
		int n = sc.nextInt();
		int sqrt = 0;
		for(int i=1;i<=n/2;i++)
		{
         if(i*i==n)
         {
         	sqrt = i;
         	break;
         }
       }
		System.out.println(sqrt==0?"not a perfect":"Sqrt is"+sqrt);
	}
}