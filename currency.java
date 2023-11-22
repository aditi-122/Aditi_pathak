import java.util.Scanner;
class Currency
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a Number: ");
		int num = sc.nextInt();
	    switch(num)
	    {
	    case 1: System.out.println("enter the inr value");
	    	    double inr = sc.nextDouble();
	    	    double $ = inr/85;
	    	    System.out.println($);
	    	    break;
	    case 2:System.out.println("enter the $ value: ");
	    	   double i1 = sc.nextDouble();
	    	   double inr1 = i1*85;
	    	   System.out.println(inr1);
	    	   break;
	    case 3:System.out.println("enter the inr value");
	    	   double i2 = sc.nextDouble();
	    	   double yen = i2/56;
	    	   System.out.println(yen);
	    	   break;
	    case 4:System.out.println("enter the inr value");	   
	     	   double i3 = sc.nextDouble();
	     	   double won = i3/16;
	     	   System.out.println(won);
	     	   break;
	    case 5:System.out.println("enter the inr value");
	            double i4 = sc.nextDouble();
	            Double  

	    }
	}
}