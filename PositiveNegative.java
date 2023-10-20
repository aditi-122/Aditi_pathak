import java.util.Scanner;
class PositiveNegative
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = sc.nextInt();
        String op =(a>0)?"Positive Number":"Negative Number";
        System.out.println("Enter number"+a+"is a"+op);
	}
}