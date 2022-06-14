package de.rnschk;

public class SwitchExpressionFeature {


    public static void main(String[] args) {

        var drink = Drink.BEER;

        // old style
        switch (drink) {
            case COFFEE:
                System.out.println("Case: IT");
                break;
            case TEA:
            case WATER:
                System.out.println("Case: The british way");
            case JUICE, COKE:
                System.out.println("Case: Sweet stuff");
                break;
            case BEER:
                System.out.println("Case: Ceers!");
                break;
            default:
                System.out.println("Case: Not thirsty");
        }

        System.out.println("---");


        // new style 1
        switch (drink) {
            case COFFEE -> System.out.println("Case: IT");
            case TEA, WATER -> System.out.println("Case: The british way");
            case JUICE, COKE -> System.out.println("Case: Sweet stuff");
            case BEER -> System.out.println("Case: Ceers!");
            // Java 17 preview:
            // case null -> System.out.println("Case: No drinks for NPE!");
            default -> System.out.println("Case: Not thirsty");
        }

        // new style 2
        var switchResult =
            switch (drink) {
                case COFFEE -> "IT";
                case TEA, WATER -> "The british way";
                case JUICE, COKE -> "Sweet stuff";
                case BEER -> {
                    System.out.println("Yeeha");
                    yield "Ceers!";
                }
                default -> "Not thirsty";
            };
        System.out.println("Case: " + switchResult);
    }

    enum Drink {
        COFFEE, TEA, WATER, JUICE, COKE, BEER, NONE;
    }
}
