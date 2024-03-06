package cc.example.demo.java16.record;

public record Range(int low, int high) {
    public Range {
        if (low > high)
            throw new IllegalArgumentException(String.format("(%d,%d)", low, high));
    }
}
