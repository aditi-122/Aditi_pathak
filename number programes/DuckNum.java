import java.util.Scanner;
 class DuckNum
 {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter a number: ");
 		int num = sc.nextInt();
 		int cnt = 0;
 		while(num!=0)
 		{
 			int rem = num%10;
 			if(rem==0)
 			{
 				cnt++;
                              num/=10;
                        }
                }
 		System.out.println(cnt>0? "Duck Number":"Not a Duck Number");	
        }
}