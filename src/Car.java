import java.util.Objects;

public class Car {

    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = Objects.requireNonNullElse(brand, "Default");
        this.model = Objects.requireNonNullElse(model, "Default");
        if (engineVolume == 0.0) {
            this.engineVolume = 1.5F;
        } else {
            this.engineVolume = engineVolume;
        }
        this.color = Objects.requireNonNullElse(color, "White");
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "Default");
    }
    Car(float engineVolume, String color, int productionYear) {
        this.brand = "Default";
        this.model = "Default";
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = "Default";
    }
    Car(String brand, String model, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = 1.5F;
        this.color = "White";
        this.productionYear = 2000;
        this.productionCountry = productionCountry;
    }


    void carInfo() {
        System.out.println("Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                '}');
    }
}
