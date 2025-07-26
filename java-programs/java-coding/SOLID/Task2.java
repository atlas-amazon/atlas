
abstract class BirdsThatFly {
    abstract void fly();
}

abstract class BirdsThatDontFly {
    abstract void speciality();
}

class Eagle extends BirdsThatFly {
    @Override
    public void fly() {
        System.out.println("Eagle flies high.");
    }
}

class Ostrich extends BirdsThatDontFly {
    @Override
    public void speciality() {
        System.out.println("Ostrich lays big eggs.");
    }
}

public class DriverClass {
    public static void main(String[] args) {

        BirdsThatFly flyingBird = new Eagle();
        flyingBird.fly();

        BirdsThatDontFly flightlessBird = new Ostrich();
        flightlessBird.speciality();
    }
}