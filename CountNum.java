import java.util.Scanner;
class CountNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0; 
		System.out.print("num: ");
		int num = sc.nextInt();
		for(;num!=0;num/=10)
		{
           count++;
		}
		System.out.println("Number of digit: " +count);
	}
}