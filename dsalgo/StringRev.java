import java.util.Scanner;
class StringRev
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String original,reverse = "";
		System.out.println("Enter a string: ");
		original = s.nextLine();
		for(int i=original.length()-1;i>=0;i--)
			reverse = reverse+ original.charAt(i);

		System.out.println("The reversed String is: "+reverse);
	}
}