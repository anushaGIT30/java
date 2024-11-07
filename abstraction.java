abstract class Animals {
    abstract void walk(); // No body for abstract methods

    public void eating() {
        System.out.println("the animal is eating ");
    }

    Animals() {
        System.out.println("this animal is belong to animal class");
    }
}// here there is no importance of showing the animals class

class Horse extends Animals {
    public void walk() {
        System.out.println("walks with 4 legs");
    }

    Horse() {
        System.out.println("this animal is a horse");
    }
}

class Chicken extends Animals {
    public void walk() {
        System.out.println("walk with 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Animals horse = new Horse();
        Animals chicken = new Chicken();

        horse.walk(); // Output: walks with 4 legs
        chicken.walk(); // Output: walk with 2 legs
        horse.eating();
    }
}

// abstraction can be implemented using 2 methods using interface and abstract
// keyword
// we can also create constructors in the abstracton
// it is not a pure abstraction so we use interfaces