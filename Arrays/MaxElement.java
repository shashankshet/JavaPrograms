import java.util.Scanner;

class MaxElement
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];

		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}	
		int mx = -199999;
		for(int i=0;i<n;i++)
		{
			mx = Math.max(mx,a[i]);
		}
		System.out.println(mx);
	}
}