package de.rnschk;

import static java.util.Objects.isNull;

public class RecordsFeature {


    public static void main(String[] args) {

        var blackCar = new Car(Color.BLACK, 230);
        //blackCar.color = Color.GREEN;
        blackCar.maxSpeed();
        System.out.println("Black car looks like " + blackCar + " [hash: " + blackCar.hashCode() + "]\n");

        var greenCar = new Car(Color.GREEN, 130);
        var anotherGreenCar = new Car(Color.GREEN, 130);
        System.out.println("Green car equals another green car? " + greenCar.equals(anotherGreenCar) + "\n");

        var yellowCar = new Car(Color.YELLOW, 120);
        var fasterYellowCar = new Car(Color.YELLOW, 140);
        System.out.println("Yellow car equals faster yellow car? " + yellowCar.equals(fasterYellowCar) + "\n");

        //var fastCar = new Car(Color.RED, 401);
        //var invisibleCar = new Car(null, 37);


        // old style (class)
        var blackCarClass = new CarClass(Color.BLACK, 230);
        System.out.println("Black car (class) looks like " + blackCarClass + " [hash: " + blackCarClass.hashCode() + "]\n");

        var otherBlackCarClass = new CarClass(Color.BLACK, 230);
        System.out.println("Black car (class) equals other black car (class)? " + blackCarClass.equals(otherBlackCarClass) + "\n");


    }


    record Car(Color color, int maxSpeed) {
        Car {
            if (maxSpeed > 350) {
                throw new IllegalArgumentException("That is to fast [Max. speed: " + maxSpeed + "]");
            }

            if (isNull(color)) {
                throw new IllegalArgumentException("Color not given. Every car must have a color!");
            }
            System.out.println("Produce " + color.name().toLowerCase() + " car [Max. speed: " + maxSpeed + "]");
        }
    }

    enum Color {
        BLACK, GREEN, BLUE, YELLOW, RED;
    }


    static class CarClass {
        private Color color;
        private int maxSpeed;

        public CarClass(final Color color, final int maxSpeed) {
            this.color = color;
            this.maxSpeed = maxSpeed;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(final Color color) {
            this.color = color;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(final int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(color, maxSpeed);
//        }
//
//        @Override
//        public boolean equals(final Object obj) {
//            if (this == obj) return true;
//            if (obj == null || getClass() != obj.getClass()) return false;
//            CarClass that = (CarClass) obj;
//            return color.equals(that.color) && maxSpeed == that.maxSpeed;
//        }
//
//        @Override
//        public String toString() {
//            return "Car[color=" + color + ", maxSpeed=" + maxSpeed + "]";
//        }
    }
}
