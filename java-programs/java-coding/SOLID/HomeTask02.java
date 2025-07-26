
abstract class Bird {
    abstract void makeSound();
}

interface FlyingBird {
    void fly();
}

interface NonFlyingBird {
    void displayUniqueAbility();
}

class Eagle extends Bird implements FlyingBird {
    @Override
    public void makeSound() {
        System.out.println("Eagle makes a screeching sound");
    }

    @Override
    public void fly() {
        System.out.println("Eagles fly high");
    }
}

class Ostrich extends Bird implements NonFlyingBird {
    @Override
    public void makeSound() {
        System.out.println("Ostrich makes a booming sound");
    }

    @Override
    public void displayUniqueAbility() {
        System.out.println("Ostriches lay big eggs and run fast");
    }
}

public class DriverClass {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.makeSound();
        eagle.fly();

        Ostrich ostrich = new Ostrich();
        ostrich.makeSound();
        ostrich.displayUniqueAbility();
    }
}
