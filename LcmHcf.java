import java.util.Scanner;
class LcmHcf
{
	public static void main(String[] args) {
		
	}
	public static void lcm() {
		Scanner sc = new Scanner(System.in);
        System.out.print("enter a two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a>b?a:b;
        for(int i=1;i<=c;i++)
        {
         if(c%a==0 && c%b==0)
         {
           c++;
           System.out.println(c+"");
         }    
        }
        public static void hcf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a two number");
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c = 	
        }
	}
}