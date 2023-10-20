import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double pi = 3.14;
		System.out.print("raidus:");
		double radius = sc.nextDouble();
		double premeter = 2*pi*radius;
		double area = pi*radius*radius;
		System.out.println("raidus of circle is -"+radius+"cm");
		System.out.println("premeter is:"+premeter+"cm");
		System.out.println("area is:"+area+"cm2"); 
            }
}