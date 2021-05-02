import java.util.Scanner;
class StarMat
{
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbre of rows: ");
		int m = s.nextInt();
		System.out.println("Enter the number of columns: ");
		int n = s.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}