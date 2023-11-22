class pattern2
// {
// 	public static void main(String[] args) {
// 		int n = 1;
// 		for(int i=1;i<=5;i++)
// 		{
// 			for(int j=1;j<=i;j++)
// 			{
				
// 				System.out.print(n+" ");
// 				n+=2;
// 			}
// 			System.out.println( );
// 		}
		
// 	}
// }
/*
output
1
3 5
7 9 11
13 15 17 19
21 23 25 27 29
*/

// {
// 	public static void main(String[] args) {
// 		for(int i=1;i<=5;i++)
// 		{
// 			for(int j=1;j<=i;j++)
// 	          {
// 				System.out.print(" ");
// 			  }
// 			for(int k=5;k>=i;k--)
// 			{
// 				System.out.print("*");
// 			}
// 			System.out.println(" ");
// 		}
		
// 	}
// }
/*
output
 *****
  ****
   ***
    **
     *
*/
// {
// 	public static void main(String[] args) {
// 		for(int i=5;i>=1;i--)
// 		{
// 			for(int j=5;j>=i;j--)
// 	          {
// 				System.out.print(" ");
// 			  }
// 			for(int k=1;k<=i;k++)
// 			{
// 				System.out.print("* ");
// 			}
// 			System.out.println(" ");
// 		}
		
// 	}
// }
/*
output
 * * * * *
  * * * *
   * * *
    * *
     *
*/

// {
// 	public static void main(String[] args) {
// 		int n = 2;
// 		for(int i=1;i<=5;i++)
// 		{
// 			for(int j=1;j<=i;j++)
// 			{
				
// 				System.out.print(n+" ");
// 				n+=2;
// 			}
// 			System.out.println( );
// 		}
		
// 	}
// }
/*
ouptut
2
4 6
8 10 12
14 16 18 20
22 24 26 28 30
*/
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
	          {
				System.out.print(" ");
			  }
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
/*
output
     *
    **
   ***
  ****
 *****
*/