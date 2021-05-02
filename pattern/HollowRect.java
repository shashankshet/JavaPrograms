import java.util.Scanner;
class HollowRect
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int m = s.nextInt();
		System.out.println("Enter the number of columns: ");
		int n =s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j = 1;j<=m;j++)
			{
				if(i==1 || i==m || j==1 || j==n)
					System.out.print(" *");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
		
	}
}