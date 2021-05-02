public class Dog {
    
    String breed,color;
    int legs,eyes;

    public void eat() {
        System.out.println("Dog is eating");
    }
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.breed ="Husky";
        d1.color = "white";
        d1.legs =4;
        d1.eyes =2;
        d1.eat();
        d2.sleep();
        System.out.println("Details of Dog 1\nBreed: "+d1.breed+"\n"+"Color: "+d1.color+"\nlegs: "+d1.legs+"\neyes: "+d1.eyes);

    }
}
