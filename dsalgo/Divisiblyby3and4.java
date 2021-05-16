import java.util.Scanner;
class Divisiblyby3and4
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int m = s.nextInt();
		System.out.println("Enter 2nd number: ");
		int n = s.nextInt();
		System.out.println("The numbers divisible by 3 and 4 are: ");
		while(m<n)
		{
			if(m%3==0 && m%4==0)
			{
				System.out.println(m);
			}
			m++;
		}
	}
}