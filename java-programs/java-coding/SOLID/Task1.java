/ Base class for all birds
abstract class Bird {
    abstract void layEggs();
}

// Interface for flying capability
interface Flyable {
    void fly();
}

// Eagle can fly and lay eggs
class Eagle extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Eagle flies high.");
    }

    @Override
    public void layEggs() {
        System.out.println("Eagle lays eggs.");
    }
}

// Ostrich can lay eggs but doesn't fly
class Ostrich extends Bird {
    @Override
    public void layEggs() {
        System.out.println("Ostrich lays big eggs.");
    }
}

// Driver class to test
public class DriverClass {
    public static void main(String[] args) {
        Flyable flyingBird = new Eagle();
        flyingBird.fly();

        Bird eagle = new Eagle();
        eagle.layEggs();

        Bird ostrich = new Ostrich();
        ostrich.layEggs();

        // Below is not allowed (at compile time) — good!
        // Flyable ostrichFly = new Ostrich(); // ERROR
    }
}