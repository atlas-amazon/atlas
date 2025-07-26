// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car {
    private Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Ram");
        Car myCar = new Car(driver);
        System.out.println("Driver's name: " + myCar.getDriver().getName());
    }
}
