class LocalGlobalVar
{
	static int b = 30;
	public static void main(String[] args) 
	{
		System.out.println(b); //30
		int b = 40;
		LocalGlobalVar.b = 90;
		System.out.println(b); //40
		LocalGlobalVar.demo();
	}
	public static void demo()
	{
		System.out.println("From demo");
		System.out.println(b); //90
		LocalGlobalVar.b =50;
		System.out.println(b); //50
		LocalGlobalVar.test();
	}
	public static void test()
	{
		System.out.println(b); //50
	}
}