import java.util.Scanner;
class Acc
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the starting velocity: ");
		double start = sc.nextDouble();
		System.out.print("enter the ending velocity: ");
		double end = sc.nextDouble();
		System.out.print("enter the  time: ");
		double time = sc.nextDouble();
		double acc = ((end-start)/time);
		System.out.println("the average acceleration in m/s is: "+acc);
	}
}