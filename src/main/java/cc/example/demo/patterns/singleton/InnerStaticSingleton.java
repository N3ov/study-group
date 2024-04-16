package cc.example.demo.patterns.singleton;

public class InnerStaticSingleton {
    private static class SingletonHolder {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    private InnerStaticSingleton (){}

    public static final InnerStaticSingleton getInstance() {

        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        // lazy load: yes
        // thread safe: yes
        InnerStaticSingleton instance1 = new InnerStaticSingleton();
        InnerStaticSingleton instance2 = new InnerStaticSingleton();
        System.out.println(instance1 == instance2);
    }
}
