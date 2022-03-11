package Day8.Problem1;

public class Main {
    public static void main(String[] args) {
        Animal[] animalArr = new Animal[3];

        animalArr[0] = new Dog();
        animalArr[1] = new Cat();
        animalArr[2] = new Tiger();

        for(int i=0; i<animalArr.length; i++){
            animalArr[i].eat();
            animalArr[i].walk();
            animalArr[i].makeNoise();
        }

    }
}
