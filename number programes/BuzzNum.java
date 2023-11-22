import java.util.Scanner;
class BuzzNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number");
		int num = sc.nextInt();
		int cnt = 0;
		while(num!=0)
		{
			num/=10;
			cnt++;
			}
			System.out.println((num%10==7 || num%7==0)?"Its a Buzz Number":"Not a Buzz Number");
	}
}