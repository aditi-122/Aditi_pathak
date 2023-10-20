import java.util.Scanner;
class Pre
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any precentage: ");
		double per = sc.nextDouble();
		if(per>60)
		{
          System.out.println("person is eligible for interview: "+per);
		}
		else{
			System.out.println("person is  not eligible for interview: "+per);
		}
    }
}
