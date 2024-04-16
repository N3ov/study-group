package cc.example.demo.patterns.singleton;

public class LazySingleton1 {
    private static LazySingleton1 singleton;

    private LazySingleton1() {
    }

    public static LazySingleton1 getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton1();
        }
        return singleton;
    }

    public static void main(String[] args) {
        // thread safe: no
        // lazy load: yes
        LazySingleton1 singleton = LazySingleton1.getInstance();
        LazySingleton1 singleton1 = LazySingleton1.getInstance();
        System.out.println(singleton == singleton1);

    }
}
