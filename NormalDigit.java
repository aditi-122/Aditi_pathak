import java.util.Scanner;
 class NormalDigit
 {
 	public static void main(String[] args) {
 		Scanner sc= new Scanner(System.in);
 		System.out.print("enter any 3 digit number:");
 		int num = sc.nextInt();
 		int op = 0;
 		int rem = num%10;
 		op = rem;
 		num = num/10;
 		rem = num%10;
 		op = op+rem;
        num = num/10;
        op = op+num;
       System.out.println("sum of digit is"+op);	

 	}
 }