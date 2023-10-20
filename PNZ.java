import java.util.Scanner;
class PNZ
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = sc.nextDouble();
        String op =(a>0)?(a>0?"Positive":"negative"):"Zero";
        System.out.println("Enter number"+a+"is a"+op);
	}
}