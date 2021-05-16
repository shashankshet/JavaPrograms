class Student
{
	public static void main(String[] args) {
		String name;
		int studentClass;
		float res;

		public void student(String s, int sclass)
		{
			System.out.println("Added student "+s+ " to the roll of class: "+sclass);
		}
		public String getName()
		{
			System.out.println(name) ;
		}
		public String publish()
		{
			if(res>33.33)
			{
				System.out.println(res);
			}
		}
	}
}
class Results extends Student
{
	int sub1,sub2,sub3;
	
}