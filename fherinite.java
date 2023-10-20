import java.util.Scanner;
class Fherinite
{
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	System.out.print("The themperature in cellcius is:");
  	double degree = sc.nextDouble();
  	double f =(9.0/5)* degree+3;
    System.out.println("the conversion in Fherinite:"+f);
  }
}