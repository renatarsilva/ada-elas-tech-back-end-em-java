import Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Puppy";
        dog1.color = "brown";
        dog1.height = 25;
        dog1.weight = 5.5f;

        dog1.bark();
        System.out.println("The dog grabbed the " + dog1.toGrab());

        System.out.println("The dog is "+ dog1.interact("care"));

    }
}