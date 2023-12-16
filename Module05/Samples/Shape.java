public abstract class Shape {
    int x, y;

    public abstract int getArea();
}
class Rectangle extends Shape {
    int width, height;
    // ... incomplete code...
    @Override
    public int getArea() {
        return width * height;
    }
}
class Circle extends Shape {
    int radius;
    // ... incomplete code...
    @Override
    public int getArea() {
        return 3.14 * radius * radius;
    }
}
class Circle2 extends Shape {
    int radius;
    final double PI = 3.14159;
    // ... incomplete code...
    @Override
    public int getArea() {
        return PI * radius * radius;
    }
}
class Circle3 extends Shape {
    int radius;
    // ... incomplete code...
    @Override
    public int getArea() {
        return Math.PI * radius * radius;
    }
}
