import java.util.Scanner;
class Gratuity
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the subtotal: ");
		double subtotal = sc.nextDouble();
		System.out.print("enter the tiprate: ");
		double tipRate =sc.nextDouble();
		double tip = (tipRate/subtotal);
		System.out.println("The tip is :"+tip);
		double total = (subtotal+tip);
		System.out.println("The total is: "+total);
       }
}