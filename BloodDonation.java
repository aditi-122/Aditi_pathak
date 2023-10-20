import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your age:");
		int age = sc.nextInt();
		if(age>=20)
		{
			System.out.println("person can donate blood"+age);
			System.out.print("person dosent consume any drugs within 2 hours(t/f: ");
			boolean op = sc.nextBoolean();
			if (op==false) {
				System.out.println("you are not eligible"+op);
				System.out.print("enter your weight: ");
				double wg = sc.nextDouble();
              if(wg >= 50 ){
            	System.out.println("you have correct weight"+wg);
            }
            else
            {
            System.out.println("you are under weight:"+wg);	
            }
			}
			else{
				System.out.println("you are not eligible"+op);
			}
		}
		else{
			System.out.println("you are not eligible "+age);
		}
	}
}