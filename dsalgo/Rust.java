import  java.util.Random;
import java.util.Scanner;
class Rust
{
	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the number of mappings: ");
		int map = s.nextInt();
		System.out.println("Enter the size: ");
		int m = s.nextInt();

		System.out.println("Enter the number of tries: ");
		int t = s.nextInt();
		for(int y=0;y<map;y++)
		{
		int rows = 2*m+1, column = 2*m+1;
		int[][] arr = new int[rows][column]; 
		   
		for (int row = 0; row < arr.length; row++)
		{
			for (int col = 0; col < arr[row].length; col++)
		    {
		    	arr[row][col] = 0; 
		    }
		}

		for(int i=0;i<arr.length;i++)
		{
			for(int j = 0;j<arr.length;j++)
			{
				if(i==0 || i==arr.length-1 ||  j==0|| j==arr.length-1)
				{
					arr[i][j]=1;
				}
				else
				{
					arr[i][j]=0;
				}
				
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j = 0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();

		}
		
		// System.out.println(b);
		int i= m;
		int j=m;
		int start = arr[i][j];
		int count = 0;
		for(int v=0;v<t;v++)
		{
			int b = (int)(Math.random()*(4)+1);
			if(start==1)
				break;
			else
			{
				switch (b)
				 {
				  case 1:
				  	// System.out.println("left");
				  	start = arr[i][j-1]; //left
				  	j--;
				    count++;
				    break;
				  case 2:
				  	// System.out.println("right");
				   	start = arr[i][j+1]; //right
				   	j++;
				   	count++;
				    break;
				  case 3:
				  	// System.out.println("up");
				    start = arr[i-1][j]; //up
				    i--;
				    count++;
				    break;
				  case 4:
				  	// System.out.println("down");
				  	start = arr[i+1][j]; //down
				  	i++;
				  	count++;
				    break;
				}
			}
			

		}
		System.out.println(count);
		
		sum = sum+count;
	}
	float avg = sum/map;
	System.out.println("Average number of steps taken by the walkers is: "+avg);
	}
}