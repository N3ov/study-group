package cc.example.demo.version.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumber {
    public static void main(String[] args) {
        System.out.println("Compact Formatting is:");
        NumberFormat upvotes = NumberFormat.getCompactNumberInstance(
                new Locale("en", "US"), NumberFormat.Style.SHORT);

        System.out.println(upvotes.format(100));
        System.out.println(upvotes.format(1000));
        System.out.println(upvotes.format(10000));
        System.out.println(upvotes.format(100000));
        System.out.println(upvotes.format(1000000));

        // set digit
        upvotes.setMaximumFractionDigits(1);
        System.out.println(upvotes.format(1234));
        System.out.println(upvotes.format(123456));
        System.out.println(upvotes.format(12345678));
    }
}
