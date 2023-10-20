import java.util.Scanner;
class Equations
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the value:");
	   double num1 = sc.nextDouble();
       System.out.print("Enter the sec value:");
       double num2 = sc.nextDouble();
       double exp =(num1*num1+2*num1*num2+num2*num2);
       System.out.println("enter the first value"+num1);
       System.out.println("enter the second value"+num2);
       System.out.println("This expression"+exp);
	}
}