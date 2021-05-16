import java.util.Scanner;
class SubArray
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

		int curr = 0;

		for(int i=0;i<n;i++)
		{
			curr = 0;
			for(int j=i;j<n;j++)
			{
				curr +=a[j];
				System.out.println(curr);
				
			}

		}
 
		
	}
}