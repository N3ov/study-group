package cc.example.demo.patterns.prototype;

public interface Shape extends Cloneable{
    void draw();
    Shape clone();
}
