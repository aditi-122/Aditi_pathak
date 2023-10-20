import java.util.Scanner;
class Waterkg
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter weight of water in kg:");
		double weight = sc.nextDouble();
		System.out.print("enter intial temperature in degree cel:");
		double it = sc.nextDouble();
		System.out.println("enter final temperature in degree cel");
		double ft = sc.nextDouble();
		double energy=( weight*(ft-it)*4148 );
		System.out.println("The energy needed is:"+energy);

	}
}