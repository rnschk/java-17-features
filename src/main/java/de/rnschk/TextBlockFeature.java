package de.rnschk;

public class TextBlockFeature {

    public static void main(String[] args) {
        var text = """
            Hallo world,
            this is a text block in Java 17!
            It has to start 3 full quotation marks and a new line,
            and also end with 3 full quotes and maybe a new line.
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
