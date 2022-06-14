package de.rnschk;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayPeriodFeature {

    // https://unicode-org.github.io/cldr-staging/charts/38/supplemental/day_periods.html
    public static void main(final String[] args) {
        var formatter = DateTimeFormatter.ofPattern("B");
        System.out.println(formatter.format(LocalTime.of(8, 0)));
        System.out.println(formatter.format(LocalTime.of(13, 0)));
        System.out.println(formatter.format(LocalTime.of(20, 0)));
        System.out.println(formatter.format(LocalTime.of(23, 0)));
        System.out.println(formatter.format(LocalTime.of(0, 0)));
    }
}
