import java.util.Scanner;
class ReverseNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int num = sc.nextInt();
		int rev = 0;
		int rem = num%10;
		rev = rem;
		num = num/10;
		rem = num%10;
		rev = rev*10+rem;
		num = num/10;
		rev = rev*10+num;
		if(num==rev)
		{
		System.out.println("pellet row number:"+rev);
		}
          else
          {
          System.out.println("This is not pellet row number"+rev);	
          }
	}
}