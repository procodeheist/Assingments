package Day8.WeProb;

public interface Animal {
    void makeNoise();
}
class Dog implements Animal{
    @Override
    public void makeNoise(){
        System.out.println("Bark..");
    }
}
class Cat implements Animal{
    @Override
    public void makeNoise(){
        System.out.println("Meow..");
    }
}

class Main{
    public static void main(String[] args) {
        Animal dogObj = new Dog();
        Animal catObj = new Cat();
        dogObj.makeNoise();
        catObj.makeNoise();
    }
}
