 // intiution: loop over the array and find the solustion
 // maintain the follwing variables:
 // 1. Previous common difference
 // 2. Current Arithmetic SubArray length
 // 3. max Arithmetic subarray length.
import java.util.Scanner;
 class LongestArithmeticArray
 {
 	public static void main(String[] args)
 	{
 		Scanner s = new Scanner(System.in);
 		int n = s.nextInt();
 		int []a = new int[n];

 		for(int i=0;i<n;i++)
 		{
 			a[i] = s.nextInt();
 		}
 		int ans =2;
 		int pd = a[1]-a[0];
 		int j=2;
 		int curr =2;
 		while(j<n)
 		{
 			if(pd == a[j]-a[j-1])
 			{
 				curr++;
 			}
 			else
 			{
 				pd = a[j]-a[j-1];
 				curr = 2;
 			}
 			ans = Math.max(ans,curr);
 			j++;
 		}
 		System.out.println(ans);
 	}
 }