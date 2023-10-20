import java.util.Scanner;
class NaturalNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Natural Number: ");
		int num = sc.nextInt();
		if(num=0)
		{
			System.out.println("Enter Natural Number is postivie"+num);
		}
		else{
              System.out.println("Enter Natural Number is negative"+num);
		}
	}
}