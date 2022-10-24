import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car(null,null, 1.7F, "Yellow", 2015,
                "Russia", "Manual", "Sedan",
                "A777MP777", 4, true, new Car.Key(true,true),
                new Car.Insurance(LocalDate.now(), 10,"578767336"), 220);
        Car audiA8 = new Car("Audi", "R8", 3.0F, "Black", 2018,
                "Germany", "Auto", "Hatchback", "F778MH789",
                4, false, new Car.Key(true,true), new Car.Insurance(LocalDate.now(),
                10,"578767336"), 180);
        Car bmwZ8 = new Car("BMW", "Z8", 5.0f, "Black",2015, "Germamy",
                 "Manual", "Sedan", "D555AS175", 2, true,
                new Car.Key(true,true), new Car.Insurance(LocalDate.now(), 10,"578767336"),
                200);
        Car kiaSportage = new Car("Kia", "Sportage 4th generation", 2.4F, "Red", 2018,
                "South-Korea", "Manual", "Sedan", "555", 5,
                 false, new Car.Key(true,true),
                new Car.Insurance(LocalDate.now(), 10,"578767336"), 190);
        Car hyundaiAvante = new Car(null, null, 1.6F, "Orange", 2016,
                "Korea", "Auto", "Hatchback", null, 0,
                false, new Car.Key(true,true),
                new Car.Insurance(LocalDate.now(), 10,"578767336"), 170);

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);

        Train martin = new Train("Martin", "B-901", 2011, "Russia", null,
                301, 3500.0, 0, "Belarus Station",
                "Minsk_Passanger", 11);
        Train leningrad = new Train("Leningrad", "D-125", 2019, "Russia",
                null, 270, 1700, 0, "Leningrad Station",
                "Leningrad-Passanger", 8);

        System.out.println(martin);
        System.out.println(leningrad);

        Bus ikarus = new Bus("Ikarus", "B52", 1987, "USSR", "Yellow",
                80);
        Bus pasik = new Bus("PavlovBusFactory", "3205", 2002, "Russia",
                "White", 60);
        Bus lias = new Bus("Lipeck", "5952", 2015, "Russia", "Blue",
                70);

        System.out.println(ikarus);
        System.out.println(pasik);
        System.out.println(lias);

        bmwZ8.refill();
        lias.refill();
        martin.refill();
    }
}