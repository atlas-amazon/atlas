
interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}


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


interface PizzaFactory {
    Pizza createPizza();
}


class PepperoniPizzaFactory implements PizzaFactory {
    private static volatile PepperoniPizzaFactory instance;

    private PepperoniPizzaFactory() {}

    public static PepperoniPizzaFactory getInstance() {
        if (instance == null) {
            synchronized (PepperoniPizzaFactory.class) {
                if (instance == null) {
                    instance = new PepperoniPizzaFactory();
                }
            }
        }
        return instance;
    }

    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}


public class Sams {
    public static void main(String[] args) {
        PizzaFactory pfobj = PepperoniPizzaFactory.getInstance();
        Pizza pobj = pfobj.createPizza();
        System.out.println("Making a Pepperoni Pizza:");
        pobj.prepare();
        pobj.bake();
        pobj.cut();
        pobj.box();
    }
}