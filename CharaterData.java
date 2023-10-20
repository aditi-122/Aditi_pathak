import java.util.Scanner;
class CharaterData
{
   public static void main(String []args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your name:");
     String name =sc.nextLine();
     System.out.print("enter a index value to fetch the char:");
     short indx = sc.nextShort();
     char ch = name.charAt((indx)-1);
     System.out.println("charater is:"+ch);
    }
}