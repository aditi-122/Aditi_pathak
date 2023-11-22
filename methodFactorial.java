class fact
{    static int fact = 1;
	public static void main(String[] args) {
		factorial(5);
	}
	public static void factorial(int num) {
		if(num==0)
		{
          System.out.println(fact);
          return;//going back to the calling method
		}
		
		fact=fact*num;//1*5 5*4 20*3 60*2 120*1 120*0
		factorial(num--);//4 3 2 1 0
	}
}