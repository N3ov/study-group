package cc.example.demo.version.java14;

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

    private static String getText1(int number) {
        return switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> "four or five or six";

            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }
}
