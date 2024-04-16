package cc.example.demo.patterns.singleton;

public class SimpleSingleton {

    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {

    }

    public static SimpleSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {

//      Runtime

        // thread safe: no
        // lazy load: no
        SimpleSingleton instance1 = SimpleSingleton.getInstance();
        SimpleSingleton instance2 = SimpleSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
