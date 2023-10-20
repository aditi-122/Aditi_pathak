import java.util.Scanner;
class Seasons
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a month: ");
		String month = sc.next();
		switch(month.toLowerCase())
		{
		case "oct":
		case "nov":
		case "dec":
        case "jan":System.out.println("it is winter buy some cloths which make you warm");break;
        case "feb":
        case "mar":
        case "apr":
        case "may":System.out.println("Its summer make your self cool");break;
        case "jun":
        case "jul":
        case "aug":
        case "sep":System.out.println("Its a monsoon buy a raincoat");break;
        default:System.out.println("Not a valid month");break;
        }
	}
}