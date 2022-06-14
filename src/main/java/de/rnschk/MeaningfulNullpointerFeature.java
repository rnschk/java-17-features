package de.rnschk;

public class MeaningfulNullpointerFeature {

    public static void main(final String[] args) {
        nullpointerMethod("foo", null);
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "bar" is null
    }

    private static void nullpointerMethod(final String foo, final String bar) {
        System.out.println(foo.length() + bar.length());
    }
}
