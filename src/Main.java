import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car(null,null, 1.7F, "Yellow", 2015,
                "Russia", "Manual", "Sedan",
                "A777MP777", 4, true, new Car.Key(true,true),
                new Car.Insurance(LocalDate.now(), 10,"578767336"));
        Car audiA8 = new Car("Audi", "R8", 3.0F, "Black", 2018,
                "Germany", "Auto", "Hatchback", "F778MH789",
                4, false, new Car.Key(true,true), new Car.Insurance(LocalDate.now(),
                10,"578767336"));
        Car bmwZ8 = new Car("BMW", "Z8", 5.0f, "Black",2015, "Germamy",
                 "Manual", "Sedan", "D555AS175", 2, true,
                new Car.Key(true,true), new Car.Insurance(LocalDate.now(), 10,"578767336"));
        Car kiaSportage = new Car("Kia", "Sportage 4th generation", 2.4F, "Red", 2018,
                "South-Korea", "Manual", "Sedan", "555", 5,
                 false, new Car.Key(true,true),
                new Car.Insurance(LocalDate.now(), 10,"578767336"));
        Car hyundaiAvante = new Car(null, null, 1.6F, "Orange", 2016,
                "Korea", "Auto", "Hatchback", null, 0,
                false, new Car.Key(true,true),
                new Car.Insurance(LocalDate.now(), 10,"578767336"));

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}