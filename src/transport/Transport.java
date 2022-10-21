package transport;

public abstract class Transport {
    String brand;
    String model;
    final int productionYear;
    final String productionCountry;
    String color;
    int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setColor(color);
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = ValidationUtils.validOrDefault(brand, "Default");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = ValidationUtils.validOrDefault(model, "Default");
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "White");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void refill();
}
