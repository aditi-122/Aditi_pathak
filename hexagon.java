import java.util.Scanner;
class Hexagon{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the side");
		double side =sc.nextDouble();
		double area = (3*Math.sqrt(3)*side*side)/2;
         System.out.println("Area of Hexagon :"+area);
			}
}