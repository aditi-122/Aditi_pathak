import java.util.Scanner;
class Cylinder
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the radius");
	    double radius= sc.nextDouble();
	    final double pi = 3.14;
	    System.out.print("enter the height of cylinder");
	    double height = sc.nextDouble();
	    double area = pi*radius*height;
	    double volume = area*height;
	    System.out.println("The area o cylinder: "+area);
	    System.out.println("The volume of cylinder: "+volume);
	}
}