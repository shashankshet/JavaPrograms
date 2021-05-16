class Addistion
{
	int add(int a, int b)
	{	
		int c;
		c=a+b;
		return c;
	}
}
class ObjectDemo
{
	public static void main(String[] args)
	{
		Addistion ad = new Addistion();
		int a,b,res;
		a=10;
		b=20;

		res = ad.add(a,b);
		System.out.println(res);
	}
}