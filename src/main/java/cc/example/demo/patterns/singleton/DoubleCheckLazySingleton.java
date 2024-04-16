package cc.example.demo.patterns.singleton;

public class DoubleCheckLazySingleton {
    private static DoubleCheckLazySingleton singleton;

    private DoubleCheckLazySingleton() {
    }

    public static DoubleCheckLazySingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        // thread safe: yes
        // lazy load: yes
        DoubleCheckLazySingleton singleton = DoubleCheckLazySingleton.getInstance();
        DoubleCheckLazySingleton singleton1 = DoubleCheckLazySingleton.getInstance();
        System.out.println(singleton == singleton1);

    }
}
