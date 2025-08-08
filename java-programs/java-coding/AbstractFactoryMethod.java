interface Car {
    void drive();
}

interface Bike {
    void race();
}

class HondaCar implements Car {
    public void drive() {
        System.out.println("Honda Car is driving.");
    }
}

class HondaBike implements Bike {
    public void race() {
        System.out.println("Honda Bike is racing.");
    }
}

class YamahaCar implements Car {
    public void drive() {
        System.out.println("Yamaha Car is driving.");
    }
}

class YamahaBike implements Bike {
    public void race() {
        System.out.println("Yamaha Bike is racing.");
    }
}

interface VehicleFactory {
    Car createCar();
    Bike createBike();
}

class HondaFactory implements VehicleFactory {
    public Car createCar() {
        return new HondaCar();
    }

    public Bike createBike() {
        return new HondaBike();
    }
}

class YamahaFactory implements VehicleFactory {
    public Car createCar() {
        return new YamahaCar();
    }

    public Bike createBike() {
        return new YamahaBike();
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory;

        String brand = "Yamaha"; 

        if (brand.equalsIgnoreCase("Honda")) {
            factory = new HondaFactory();
        } else {
            factory = new YamahaFactory();
        }

        Car car = factory.createCar();
        Bike bike = factory.createBike();

        car.drive();
        bike.race();
    }
}    
    
