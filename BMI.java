import java.util.Scanner;
class BMI
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight in pound");
		double pounds =sc.nextDouble();
		double weightkg = (pound*0.45359);
		System.out.print("Enter the height in incles:");
		double height = (incles*0.0254);
		double BMI = (weightkg/(heightm*heightm));
		System.out.println("The BMI is:"BMI);
	}
}