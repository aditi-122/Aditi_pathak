class ReverseNumber
{
	public static void main(String[] args){
		int n = 765432;
		int r=0;
	    for(n=765432;n!=0;n/=10)
	    {
	    	int rem = n%10;
		    r = r*10+rem;
		}
	   System.out.println("Reverse a number "+ r);
	}
	
}