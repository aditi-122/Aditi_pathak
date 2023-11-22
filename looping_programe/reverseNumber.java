import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any Number: ");
		int n = sc.nextInt();
		int r=0;
	    for(;n!=0;n/=10)
	    {
	    	int rem = n%10;
		    r = r*10+rem;
		}
	   System.out.println("Reverse a number "+r);
	}
	
}