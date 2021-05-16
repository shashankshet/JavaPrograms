//static is loaded before main block
class Static
{
	static
	{
		System.out.println("class is loading.....STB1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Inside main");
	}
	static
	{
		System.out.println("class is loading.....STB2");
	}
}