import java.util.Scanner;
class AmstrongNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number here : ");
		int num = sc.nextInt();
		int dup1 = num;
		int dup2 = num;
		int count = 0;
		int sum = 0;
		while(dup1>0){
			dup1/=10;
			count++;
		}
		while(dup2>0){
			int rem = dup2%10;
			int pow = 1;
			for(int i= 1 ; i<=count;i++){
				pow*=rem;
			}
			sum+=pow;
			dup2/=10;
		}
		System.out.println(sum==num? "ArmStrong No" : "Not a ArmStrong No");
	}
}