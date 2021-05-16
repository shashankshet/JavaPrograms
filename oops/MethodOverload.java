class Rectangle
{
	int area(int l, int b)
	{
		return l*b;
	}

	double area( double l, double b)
	{
		return l*b;
	}
}
class MethodOverload
{
	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle();
		int l1 = 10;
		int b1 = 20;
		System.out.println("The area of rectangle is: "+rect.area(l1,b1));
		double l2 = 10.0;
		double b2 = 20.0;
		System.out.println("The area of rectangle is: "+rect.area(l2,b2));



	}
}