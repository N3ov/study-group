package cc.example.demo.patterns.singleton;

public class LazySingleton2 {
    private static volatile LazySingleton2 singleton;

    private LazySingleton2() {
    }

    public static synchronized LazySingleton2 getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton2();
        }
        return singleton;
    }

    public static void main(String[] args) {
        // thread safe: yes
        // lazy load: yes
        LazySingleton2 singleton = LazySingleton2.getInstance();
        LazySingleton2 singleton1 = LazySingleton2.getInstance();
        System.out.println(singleton == singleton1);

    }
}
