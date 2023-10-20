import java.util.Scanner;
class Hi
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number: ");
		int a = sc.nextInt();
		if(a%5==0){
			System.out.println("hi Five "+a);
		}
		if(a%2==0)
		{
			System.out.println("hi even "+a);
		}
	}
}