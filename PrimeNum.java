import java.util.Scanner;
class PrimeNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a num: ");
		int num = sc.nextInt();
		int count = 0;
		for(int i =2;i<num;i++)
		{
			if(num %i==0)
				count++;
			if(count>0)
				break;
		}
		System.out.println(count>0?"not a prime":"Prime number");
	}
}


