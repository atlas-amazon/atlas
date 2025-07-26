
class Engine {
    public void start() {
        System.out.println("Engine starting");
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car myCar = new Car(engine);
        myCar.drive();
    }
}