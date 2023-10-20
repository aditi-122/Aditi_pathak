import java.util.Scanner;
class EvenOd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number");
		int a = sc.nextInt();
		if(a%2==0){
			System.out.println("Enterned number is even"+a);
		}
		else
		{
			System.out.println("Entered number is odd"+a);
		}
	}
}