import java.util.Scanner;
class RecordBreaking
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int a[] = new int[n+1];
		a[n] =-1;

		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}

		if(n == 1)
		{
			System.out.println("1");
			System.exit(0);
		}   

		int ans =0;
		int mx = -1;

		for(int i=0;i<n;i++)
		{
			if(a[i]>mx && a[i]>a[i+1])
			{
				ans++;
			}
			mx = Math.max(mx,a[i]);

		}
		System.out.println(ans);
	}
}