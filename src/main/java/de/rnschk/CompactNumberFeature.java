package de.rnschk;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFeature {

    public static void main(final String[] args) {
        var englishShort = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        System.out.println(englishShort.format(499)); // 499
        System.out.println(englishShort.format(500)); // 500
        System.out.println(englishShort.format(501)); // 501
        System.out.println(englishShort.format(1000)); // 1K
        System.out.println(englishShort.format(100000)); // 100K
        System.out.println(englishShort.format(1000000)); // 1M
        System.out.println(englishShort.format(1499999)); // 1M
        System.out.println(englishShort.format(1500000)); // 2M
        System.out.println(englishShort.format(1500001)); // 2M
        System.out.println("---");

        var englishLong = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        System.out.println(englishLong.format(1000));
        System.out.println(englishLong.format(100000));
        System.out.println(englishLong.format(1000000));
        System.out.println("---");

        var germanShort = NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.SHORT);
        System.out.println(germanShort.format(1000));
        System.out.println(germanShort.format(100000));
        System.out.println(germanShort.format(1000000));
        System.out.println("---");

        var germanLong = NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.LONG);
        System.out.println(germanLong.format(1000));
        System.out.println(germanLong.format(100000));
        System.out.println(germanLong.format(1000000));
    }

}
