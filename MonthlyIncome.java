import java.util.Scanner;
class MonthlyIncome
{
	public static void main(String[] args) {
		{
		 Scanner sc = new Scanner(System.in);
		final double mrate = (1+(0.05/12));
		System.out.print("Enter monthly saving account:");
		double amount = sc.nextDouble();
		double firstmonth = (amount*mrate);
		double secondmonth =((amount+firstmonth)*mrate);
		double thirdmonth =((amount+secondmonth)*mrate);
        double fourthmonth =((amount+thirdmonth)*mrate);
        double fifthmonth =((amount+forthmonth)*mrate);
        double sixthmonth =((amount+sixthmonth)*mrate);
        System.out.println("After six months the account value is:"+sixmonth);		
	}
}