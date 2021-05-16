//write a java program to take user input for an array and then return the sorted array as ouptut.
import java.util.Scanner;
import java.util.Arrays;
class SortArray
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = s.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			array[i] = s.nextInt();

		}
		Arrays.sort(array);
		System.out.println("Elements after sorting are: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
}