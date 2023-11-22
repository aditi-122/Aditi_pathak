class Pattern3
{
public static void main(String[] args) {
		int k ;
		int m = 0;
		for(int i=1;i<=5;i++)
		{
				m=m+i;
				k=m;
				for(int j=1;j<i;j++)
			System.out.println(k-- +" " );
		}
		
	}
}	