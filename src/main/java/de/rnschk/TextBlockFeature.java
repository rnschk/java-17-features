package de.rnschk;

public class TextBlockFeature {

    public static void main(String[] args) {
        var text = """
            Hallo world,
            this is a text block in Java 17!
            It has to start with 3 quotation marks and a new line,
            and it has to end with 3 quotes and maybe a new line.
            Line breaks might\
            be skipped with a single backslash (\\)
            You might also add some
           {
              "json": true,
              "foo": "bar",
            "fin": 37
             }
             """;

        System.out.println(text);
    }
}
