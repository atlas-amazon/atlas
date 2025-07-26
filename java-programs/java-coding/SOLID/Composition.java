
class Wheel {
    public Wheel() {
        System.out.println("Wheel created");
    }
}

class Car {
    private Wheel[] wheels;

    public Car() {
        wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel(); 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); 
    }
}