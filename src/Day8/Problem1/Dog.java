package Day8.Problem1;

public class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Barking...");
    }
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
