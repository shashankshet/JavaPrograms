import java.util.Scanner;
class InvertedPyramid{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int m = s.nextInt();
		System.out.println("Enter the number of cols: ");
		int n = s.nextInt();
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n--;j++)
			{
				System.out.print(" *");
				
			}
			System.out.println();
		}
	}
}