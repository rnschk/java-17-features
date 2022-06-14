package de.rnschk;

public class InstanceOfCastingFeature {

    public static void main(final String[] args) {
        oldStyle(new Foo("foo"));
        oldStyle(new Object());

        newStyle(new Foo("foo"));
        newStyle(new Object());
    }

    private static void oldStyle(final Object o) {
        if (o instanceof Foo) {
            var foo = (Foo) o;
            System.out.print(foo.content());
        } else {
            System.out.println("bar");
        }
    }

    private static void newStyle(final Object o) {
        if (o instanceof Foo foo) {
            System.out.print(foo.content());
        } else {
            System.out.println("bar");
        }
    }

    record Foo(String content) { }
}
