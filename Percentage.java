import java.util.Scanner;
class Percentage{
	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("enter any number: ");
	 	int  score = sc.nextInt();
	 	if(score>90)
	 	{
	 		score+=(score*3/100);
	 		System.out.println("Increase scre by 3%"+score);
        }
        else
        {
        	System.out.println("Not Increase its only 1%"+score);
        }
	 }
}