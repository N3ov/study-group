package cc.example.demo.java12;

import java.util.Objects;
import java.util.Optional;

public class StringApiExample {

    public static void main(String[] args) {

        Optional<String> s = Objects.requireNonNull(getStringOrNull()).describeConstable();

        System.out.println(s.get());

    }

    private static String getStringOrNull() {

        long time = System.currentTimeMillis();
        System.out.println("current time:" + time);
        if (time % 2 == 0) {
            return "2";
        }
        return "1";
    }
}
