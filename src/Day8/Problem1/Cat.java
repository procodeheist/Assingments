package Day8.Problem1;

public class Cat extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Meow...");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }
}
