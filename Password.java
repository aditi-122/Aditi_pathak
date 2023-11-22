import java.util.Scanner;
class Password
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin1 = 123;
		int count = 3;
		do{
			System.out.print("enter your pin: ");
			int pin2 = sc.nextInt();
			if(pin1==pin2)
			{
				System.out.println("phone has been unlock");
				break;
			}
			else
			{
				System.out.println("Incorrect pin"+(count-1)+"number of attempts");
			}
			count --;
		}while(count!=0);
	}
}