import java.util.Scanner;
class Add
{
	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Num1:");
	  int Num1 = sc.nextInt();
	  System.out.print("Num2:");
	  int Num2 = sc.nextInt();
      int Num3 = Num1+Num2;
      System.out.println("Addition of two number:"+Num3);
	}
}