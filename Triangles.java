import java.util.Scanner;
class Triangles
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the first value :");
	  double num1 = sc.nextDouble();
	  System.out.print("enter the second value:");
	  double num2 = sc.nextDouble();
	  System.out.print("enter the third value");
	  double num3 = sc.nextDouble();
	  double area = (num1+num2+num3)/2;
      System.out.println("Area of triangle"+area);
      
	}
} 

