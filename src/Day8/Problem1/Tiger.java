package Day8.Problem1;

public class Tiger extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Raoring...");
    }
    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }

    @Override
    public void walk() {
        System.out.println("Tiger is walking");
    }
}
