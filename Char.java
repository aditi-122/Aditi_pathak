import java.util.Scanner;
class Char{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any charater");
		char ch = sc.next().charAt(0);
		String op = ((ch>=65 && ch<=90)||(ch>=97 && ch<=122))?"Charater":"Not a charater";      
		System.out.println(""+op); 
	}
}