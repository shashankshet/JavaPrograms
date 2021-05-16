import java.util.Scanner;
class FirstReapeatingElement
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0;i<n;i++)
		{
			a[i] = s.nextInt();
		}

		final int m = 2000000;

		int idx[] = new int[m];

		for(int i=0;i<m;i++)
		{
			idx[i] = -1;
		}

		int mindx = 2147483647;
		for(int i=0;i<n;i++)
		{
			if(idx[a[i]] != -1)
			{
				mindx = Math.min(mindx,idx[a[i]]);
			}
			else
			{
				idx[a[i]] =i;
			}
		}

		if(mindx == 2147483647)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(mindx+1);
		}
	}

}