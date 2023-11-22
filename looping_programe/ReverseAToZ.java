import java.util.Scanner;
class ReverseAToZ
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any charater: ");
		char ch = sc.next().charAt(0);
		int i = 90;
		while(i>=65){
			i--;
			ch--;
			System.out.println(ch+":"+i);
			}
		}
}