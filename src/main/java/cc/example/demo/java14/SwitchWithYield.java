package cc.example.demo.java14;

public class SwitchWithYield {


    private static String getText(int number) {
        return switch (number) {
            case 1, 2:
                yield "one or two";
            case 3:
                yield "three";
            case 4, 5, 6:
                yield "four or five or six";
            default:
                yield "unknown";
        };
    }
}
