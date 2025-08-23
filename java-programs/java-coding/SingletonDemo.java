public class SingletonDemo {
    public static void main(String[] args) {
        
    Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("Both s1 and s2 are the same instance.");
        } else {
            System.out.println("s1 and s2 are different instances.");
        }

        s1.showMessage();
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
       
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}