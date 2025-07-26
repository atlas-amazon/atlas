
interface IShape2D {
    void calcArea();
}

interface IShape3D {
    void calcArea();
    void calcVolume();
}

class Circle implements IShape2D {
    @Override
    public void calcArea() {
        System.out.println("Area of Circle: πr²");
    }
}

class Rectangle implements IShape2D {
    @Override
    public void calcArea() {
        System.out.println("Area of Rectangle: l × w");
    }
}

class Sphere implements IShape3D {
    @Override
    public void calcArea() {
        System.out.println("Surface area of Sphere: 4πr²");
    }

    @Override
    public void calcVolume() {
        System.out.println("Volume of Sphere: (4/3)πr³");
    }
}

class Cube implements IShape3D {
    @Override
    public void calcArea() {
        System.out.println("Surface area of Cube: 6a²");
    }

    @Override
    public void calcVolume() {
        System.out.println("Volume of Cube: a³");
    }
}

public class DriverClass {
    public static void main(String[] args) {

        IShape2D circle = new Circle();
        IShape2D rectangle = new Rectangle();

        circle.calcArea();
        rectangle.calcArea();

        IShape3D sphere = new Sphere();
        IShape3D cube = new Cube();

        sphere.calcArea();
        sphere.calcVolume();

        cube.calcArea();
        cube.calcVolume();
    }
}