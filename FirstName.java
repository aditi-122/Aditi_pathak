import java.util.Scanner;
class FirstName
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name =sc.next(); 
		System.out.print("Enter a index value to fetch the char: ");
        byte indx = sc.nextByte();
        char ch = name.charAt((indx)-1);
        String op = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?"Vowel":"Consonant";
        System.out.println("The enterd name is: "+op);
	}
}
 