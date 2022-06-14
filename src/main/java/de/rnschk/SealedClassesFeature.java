package de.rnschk;

public class SealedClassesFeature {

    public static void main(final String[] args) {
        var circle = new Circle(2);
        printSizeOf(circle);

        var rectangle = new Rectangle(3, 4);
        printSizeOf(rectangle);

        var square = new Square(5);
        printSizeOf(square);
    }

    private static void printSizeOf(final Shape shape) {
        System.out.println(shape.getClass().getSimpleName() + ": " + shape.size());
    }

    public static abstract sealed class Shape permits Circle, Rectangle {
        abstract double size();
    }

    public static final class Circle extends Shape {
        int r;

        public Circle(final int r) {
            this.r = r;
        }

        double size() {
            return 3.141592 * r * r;
        }
    }

    public static non-sealed class Rectangle extends Shape {
        int a, b;

        public Rectangle(final int a, final int b) {
            this.a = a;
            this.b = b;
        }

        double size() {
            return a * b;
        }
    }

    public static class Square extends Rectangle {
        public Square(final int a) {
            super(a, a);
        }
    }
}
