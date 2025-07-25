
interface Shape {
    double area(); // use double for precision
}

class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private int height;

    public Square(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height * height;
    }
}

class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class OpenClosedExample {
    
    public int compareArea(Shape a, Shape b) {
        return Double.compare(a.area(), b.area());
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(6);
        Shape triangle = new Triangle(4, 8);

        OpenClosedExample example = new OpenClosedExample();

        System.out.println("Circle area: " + circle.area());
        System.out.println("Square area: " + square.area());
        System.out.println("Triangle area: " + triangle.area());

        System.out.println("Comparing Circle and Square: " + example.compareArea(circle, square));
        System.out.println("Comparing Triangle and Circle: " + example.compareArea(triangle, circle));
    }
}