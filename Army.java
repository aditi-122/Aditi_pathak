import java.util.Scanner;
class Army
{
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.print("enter your age: ");
              int age = sc.nextInt();
              if(age >=18){
                     System.out.println("You fulfill the criteria");
                     System.out.print("Enter your height: ");
                     double hg = sc.nextDouble();
                     if (hg >=162) {
                            System.out.println("You are eligible");
                            System.out.print("Enter your weight in kg(s):");
                            double wg = sc.nextDouble();
                            if (wg >=56) {
                                   System.out.println("Your weight is correct");
                            }
                            else{
                                   System.out.println("Weight is not correct");
                            }
                     }
                     else
                     {
                            System.out.println("Your age doesnt eligible" );
                     }
              }
              else{
                     System.out.println("dosent fullfill the criteria");
              }
       } 
}