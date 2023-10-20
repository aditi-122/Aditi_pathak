import java.util.Scanner;
class PassFail
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your marks: ");
		double marks = sc.nextDouble();
		if(marks>=75)
		{
			System.out.println("Distinct "+marks);
		}
		else if(marks>=60)
		{
			System.out.println("First Division"+marks);
		}
		else if(marks >=50)
		{
			System.out.println("Second Division"+marks);
		}
		else if(marks >=35)
		{
			System.out.println("passed"+marks);
		}
		else if(marks == 35)
		{
			System.out.println("just passed "+marks);
		}
        else
        {
        	System.out.println("fail"+marks);
        }
	}
}