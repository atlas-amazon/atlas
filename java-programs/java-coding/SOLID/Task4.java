
interface ICalcArea {
    void calcArea();
    void calcPerimeter();
}

interface ICalcVolume {
    void calcVolume();
}

class Circle implements ICalcArea {
    @Override
    public void calcArea() {
        System.out.println("Area of Circle: πr²");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Perimeter of Circle: 2πr");
    }
}

class Sphere implements ICalcArea, ICalcVolume {
    @Override
    public void calcArea() {
        System.out.println("Surface Area of Sphere: 4πr²");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Perimeter not defined for a Sphere."); 
    }

    @Override
    public void calcVolume() {
        System.out.println("Volume of Sphere: (4/3)πr³");
    }
}

public class DriverClass {
    public static void main(String[] args) {
        // Working with Circle
        ICalcArea circle = new Circle();
        circle.calcArea();
        circle.calcPerimeter();

        System.out.println("------------------------");

        Sphere sphere = new Sphere();
        sphere.calcArea();
        sphere.calcVolume();
        sphere.calcPerimeter(); 
    }
}