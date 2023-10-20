import java.util.Scanner;
class Rectangle
{ 
   public static void main(String[] args) {
      
   Scanner sc = new Scanner(System.in);
   System.out.print("enter the lenght:");
   double length = sc.nextDouble();
   System.out.print("enter the breadth:");
   double breadth = sc.nextDouble();
   double perimiter = 2*(length+breadth);
   double area = length*breadth;
   System.out.println("length of rectangle"+length);
   System.out.println("breath of rectangle"+breadth);
   System.out.println("Area of rectangle:"+area+"is"+area);
      }
}