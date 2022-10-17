public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car(null,null, 1.7F, "Yellow", 2015, "Russia");
        Car auduA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0F, "Black", 2020, "Germany");
        Car bmwZ8 = new Car("BMW", "Z8", "Germamy");
        Car kiaSportage = new Car("Kia", "Sportage 4th generation", 2.4F, "Red", 2018, "South-Korea");
        Car hyundaiAvante = new Car(1.6F, "Orange", 2016);

        ladaGranta.carInfo();
        auduA8.carInfo();
        bmwZ8.carInfo();
        kiaSportage.carInfo();
        hyundaiAvante.carInfo();
    }
}