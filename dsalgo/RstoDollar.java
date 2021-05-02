import java.util.Scanner;
class RstoDollar
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount in rupees: ");
		double rs= s.nextDouble();
		double dollar = rs/74.48;
		System.out.println("Amount in dollar is "+dollar);

	}
}