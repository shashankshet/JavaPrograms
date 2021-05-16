class Loading
{
	static int i;
	public static void main(String[] args) {
		
		demo();
		i =10;
		demo();
	}
	public static void demo()
	{
		System.out.println("Inside demo "+i);
	}
}