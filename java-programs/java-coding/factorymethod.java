// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Product Interface
interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}

// Concrete Product
class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni Pizza");
    }
}

// Creator Interface
interface PizzaFactory {
    Pizza createPizza();
}

// Concrete Creator
class PepperoniPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}

// Driver Class
public class Sams {
    public static void main(String[] args) {
        PizzaFactory pfobj = new PepperoniPizzaFactory();
        Pizza pobj = pfobj.createPizza();
        pobj.prepare();
        pobj.bake();
        pobj.cut();
        pobj.box();
    }
}

