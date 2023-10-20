//write a java prgrame to wirte last digit of a number.
import java.util.Scanner;
class LastDigit
{
	public  static  void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.print("Enter  a number:");
     int num1 = sc.nextInt();
     int num = num1%10;
     System.out.println("LastDigit"+num1+"is"+num);
    }
}