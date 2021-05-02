interface Animal
{
	public void animalSound();
	public void sleep();
}

class Pig implements Animal
{
	public void animalSound()
	{
		System.out.println("The pig says: Wee wee");
	}
	public void sleep()
	{
		System.out.println("Zzzz");
	}
}

class Interface
{
	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}