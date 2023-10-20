import java.util.Scanner;
class UserInfo
{   
     public static void main(String [] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("UserName:");
     String n =sc.nextLine();
     System.out.print("Nativeplace:");
     String h = sc.next();
     System.out.print("year of passing");
     short i = sc.nextshort();
     System.out.print("Branch");
     String j = sc.nextLine();
     System.out.print("University");
     String k = sc.nextLine();
     System.out.print("CGPA");
     float m = sc.nextFloat();
     System.out.print("Do you have any backlock");
     boolean l = sc.nextBoolean();
     System.out.println("My Name is"+n); 
     System.out.println("Native Place"+h);
     System.out.println("Year Of Passing"+i);
     System.out.println("Branch "+j);
     System.out.println("University"+k);
     System.out.println("CGPA"+m);
     System.out.println("Do you have any backlock"+l);
      }
}