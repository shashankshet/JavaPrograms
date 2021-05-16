import java.io.*;
import java.util.Scanner;
class Array
{
	public static void main(String[] args) {
		int a[] = {1,1,2,3,4,5,6,7};
		System.out.println("Sum of array is "+sum(a));
		System.out.println("count of 1 in the array is "+findCount(a,1));
		
	}
	public static int sum(int a [])
	{
		int total = 0;
		for(int i=0; i<a.length;i++)
			total+=a[i];
		return total;
	}
	public static int findCount(int a[], int k)
	{
		int count =0;
		for(int e: a)
		{
			if(e==k)
				count++;
		}
		return count;
	}
}