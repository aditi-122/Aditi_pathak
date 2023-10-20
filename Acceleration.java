import java.util.Scanner;
class Acceleration
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the takeoff speed: ");
		double takeoff = sc.nextDouble();
		System.out.print("Enter the Acceleration: ");
		double acce = sc.nextDouble();
		double length = ((takeoff*acce)/(2*acce));
		System.out.println("The enery needed is:"+length);
	}
}