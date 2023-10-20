import java.util.Scanner;
class PoundKillogram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the pound: ");
		double pound = sc.nextDouble();
		double kg = pound*0.454;
		System.out.println("Converstion of pound into killogram: "+kg);
	}
}