import java.util.Scanner;
class PalindromeNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number: ");
		int num = sc.nextInt();
		int org_num = num; 
		int rev = 0;
		for(int i = num;i!=0;i/=10)
		{
			int rem = i%10;
			rev = rev*10+rem;
		}
		
		System.out.println(num==rev?"Its a PalindromeNumber":"Not a palidrome number");
		
	}
}//imp