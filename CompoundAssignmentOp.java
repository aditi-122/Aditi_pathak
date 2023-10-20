class CompoundAssignmentOp
{
	public static void main(String[] args) {
		int a=30;
		int b= 20;
		int b+=b;
		int b-=b;
		int b*=b;
		int b/=b;
		int b%=b;
	 System.out.println("addition"+b);
	 System.out.println("substraction"+b);
	 System.out.println("multiplication"+b);
	 System.out.println("division"+b);
	 System.out.println("modules"+b);
	}
}