import java.util.*;
class MethodEx
{
	public static void main(String[] args) {
		
	}
}
public class utility
{
	public static void evenOdd() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("enter a number: ");
	 int a = sc.nextInt();
	 //Odd and Even Logic
	 System.out.println(a%2==0?"Even Number":"Odd number"+a);
	}
}
{
   public static void reverseNumber() {
   	Scanner sc = new Scanner(System.in);
   	System.out.print("Enter a number: ");
   	int num = sc.nextInt();
   	//reversing a number through logic
   	int rev = 0;
   	for(i=num;num!=0;i/=10)
   	{
   		int rem = num%10;
   		rev = rev*10+rem;
   	}
   	System.out.println(rev==0?"Reverse Number":"Not a Reverse Number");
   }
   {
   	public static void primeNumber() {
   	  Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter a Number:");
   	  int num = sc.nextInt();
   	  for(i=2;num!=0;i/=10)
   	  {
   	  	if(num%i==0)
   	  	{
   	  		System.out.println("Prime Number");
   	  	}
   	  	else{
   	  		System.out.println("Not a Prime Number");
   	  	}
   	  }
   	}
   }
}
