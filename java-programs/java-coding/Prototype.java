interface Prototype {
    Prototype clone(); 
}
class Person implements Prototype {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Prototype clone() {
        return new Person(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
       
        Person original = new Person("Charlie", 30);
        System.out.println("Original person:");
        original.displayInfo();

        Person cloned = (Person) original.clone();
        cloned.setName("Vicky"); 
        System.out.println("\nAfter cloning:");
        System.out.println("Original person:");
        original.displayInfo();
        System.out.println("Cloned person:");
        cloned.displayInfo();
    }
}