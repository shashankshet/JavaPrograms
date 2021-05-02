import java.util.Scanner;
class RevString
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = s.nextLine();
		System.out.println("Reverse string: "+reverse(str));

	}
	static String reverse(String str)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		return sb.toString();
	}
}