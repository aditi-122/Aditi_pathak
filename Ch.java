import java.util.Scanner;
class Ch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a charater: ");
		char ch = sc.next().charAt(0);
		String op =(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?"Vowel":"Consonant";
		System.out.println("Enterd charate "+ch+"is a:"+op);
	}
}