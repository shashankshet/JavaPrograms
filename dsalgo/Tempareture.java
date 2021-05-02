class Tempareture
{
	public static void main(String[] args) {
		double cel,far;
		cel =37;
		far = ((cel*9)/5) + 32;
		if(far >97 && far <99)
			System.out.println("Normal body tempareture: "+far+"F");
		else if (far < 97) 
		{
			System.out.println("Low body tempareture: "+far+"F" );
		}
		else
			System.out.println("High body tempareture: "+far+"F");
	}
}