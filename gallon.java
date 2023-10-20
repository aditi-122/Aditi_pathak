import java.util.Scanner;
class Gallon{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the driving distance");
		double distance = sc.nextDouble();
		System.out.print("enter the miles:");
		double miles = sc.nextDouble();
		System.out.print("enter the price: ");
		double price = sc.nextDouble();
		double cost = (distance/miles)*price;
		System.out.println("The cost of driving:"+cost);
	}
}