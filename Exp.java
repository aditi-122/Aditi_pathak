import java.util.Scanner;
class Exp
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int tc = sc.nextInt();
		final int win = 2023;
		int num = tc;
		int sum = 0;
		while(num!=0)
	   {
         int rem = num%10;
         int a =100/rem;
	   }
         sum+=rem;
        System.out.println(sum==win?"Winner":"Lose the money");
    }	

}    