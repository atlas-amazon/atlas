import java.util.HashMap;

interface Shape {
    void draw(int x, int y); // Extrinsic state passed here
}

class Circle implements Shape {
    private final String color; // Intrinsic state

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + color + " circle at (" + x + ", " + y + ")");
    }
}

class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Created new circle of color: " + color);
        }

        return circle;
    }
}

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        String[] colors = { "Red", "Green", "Blue", "Red", "Green" };

        for (int i = 0; i < colors.length; i++) {
            Shape circle = ShapeFactory.getCircle(colors[i]);
            circle.draw(i * 10, i * 20); 
        }
    }
}