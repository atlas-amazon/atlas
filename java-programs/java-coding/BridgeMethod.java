class GenericClass<T> {
    public T getValue() {
        return null;
    }
}

class StringClass extends GenericClass<String> {
    @Override
    public String getValue() {
        return "Hello from StringClass";
    }
}

public class BridgeMethodExample {
    public static void main(String[] args) {
        GenericClass<String> obj = new StringClass();
        System.out.println(obj.getValue());
    }
}