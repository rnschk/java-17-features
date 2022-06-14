package de.rnschk;

import java.util.List;
import java.util.stream.Collectors;

public class StreamToListFeature {

    public static void main(final String[] args) {

        var elements = List.of("oof", "rab", "ooz");

        var oldStyle = elements.stream()
                               .map(s -> new StringBuilder(s).reverse().toString())
                               .collect(Collectors.toList());

        System.out.println(oldStyle);

        var newStyle = elements.stream()
                               .map(s -> new StringBuilder(s).reverse().toString())
                               .toList();

        System.out.println(newStyle);

    }
}
