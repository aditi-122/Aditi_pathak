import java.util.Scanner;
class Min
{
	 public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		System.out.print("enter the first value: ");
  		int a = sc.nextInt();
  		System.out.print("enter the seond value: ");
  		int b = sc.nextInt();
        int c = a<b?a:b;
  		System.out.println("Min is:"+c);
  	}
}