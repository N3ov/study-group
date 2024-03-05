package cc.example.demo.java15;

import java.lang.invoke.MethodHandles;

@FunctionalInterface
interface MyFunctionalInterface {
    String myMethod();
}

public class HiddenClass {

    public static void main(String[] args) throws Throwable {
        byte[] classInBytes = classInfo();
        Class<?> proxy = MethodHandles.lookup()
                .defineHiddenClass(classInBytes, true, MethodHandles.Lookup.ClassOption.NESTMATE)
                .lookupClass();

        MyFunctionalInterface instance = (MyFunctionalInterface) proxy.getDeclaredConstructor().newInstance();
        String result = instance.myMethod();
        System.out.println(result);
    }

    private static byte[] classInfo() {
        String classContent = """
                import java.util.function.Supplier;

                public class HiddenClassLambda implements cc.example.demo.java15.HiddenClass.MyFunctionalInterface {
                    public String myMethod() {
                        Supplier<String> lambda = () -> "This is a hidden class example using lambda";
                        return lambda.get();
                    }
                }
                """;
        return classContent.getBytes();
    }
}