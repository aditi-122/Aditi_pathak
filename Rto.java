import java.util.Scanner;
class Rto
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your age: ");
		int age = sc.nextInt();
		if(age >=18){
			System.out.println("you are eligible"+age);
			System.out.print("enter you pass the test or not(t/f)");
			boolean test = sc.nextBoolean();
			if(test==true){
				System.out.println("you are eligible tell me percentage: "+test);
				System.out.print("enter your percentage: ");
				double per = sc.nextDouble();
				if (per >=60) {
					System.out.println("your percentage is not satisfy the condition"+per);
				}
				else{
				  System.out.println("re-appear for test"+per);
				}
			}
			else{
				System.out.println("first pass the test"+test);
			}
		}
		else
		{
			System.out.println("your age cannot satisfy the eligiblity criteria"+age);
		}
	}
}