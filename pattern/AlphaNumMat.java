class AlphaNumMat
{
	public static void main(String[] args) {
		/* o\p
		12345
		abcde
		12345
		abcde
		12345
		*/
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				for(char c='a';c<='e';c++)
				{
					System.out.print(c);
				}
			}
			else
			{
				for(int j=1;j<=5;j++)
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}