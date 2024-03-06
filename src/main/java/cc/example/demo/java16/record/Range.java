package cc.example.demo.java16.record;

public record Range(int low, int height) {
    public Range {
        if (low > height)
            throw new IllegalArgumentException(String.format("(%d,%d)", low, height));
    }
}
