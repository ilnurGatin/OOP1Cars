package transport;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    float engineVolume;
    String color;
    private final int productionYear;
    private final String productionCountry;
    String transmission;
    private final String carcaseType;
    String registrationNumber;
    private final int seatsAmount;
    boolean isWinterTires;
    private final Key key;
    private final Insurance insurance;


    public Car(String brand, String model, float engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String carcaseType, String registrationNumber,
               int seatsAmount, boolean isWinterTires, Key key, Insurance insurance) {
        this.brand = ValidationUtils.validOrDefault(brand, "Default");
        this.model = ValidationUtils.validOrDefault(model, "Default");
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5f;
        this.color = ValidationUtils.validOrDefault(color, "White");
        this.productionYear = productionYear > 0 ? productionYear : 2000;
        this.productionCountry = ValidationUtils.validOrDefault(productionCountry, "Default");
        this.transmission = ValidationUtils.validOrDefault(transmission, "Manual");
        this.carcaseType = ValidationUtils.validOrDefault(carcaseType, "Default");
        this.registrationNumber = registrationNumber;
        this.seatsAmount = seatsAmount > 0 ? seatsAmount : 4;
        this.isWinterTires =isWinterTires;
        this.key = key;
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", carcaseType='" + carcaseType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seatsAmount=" + seatsAmount +
                ", isWinterTires=" + isWinterTires +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getCarcaseType() {
        return carcaseType;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean getIsWinterTires() {
        return isWinterTires;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5f;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "White");
    }

    public void setTransmission(String transmission) {
        this.transmission = ValidationUtils.validOrDefault(transmission, "Default");
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTireType(boolean isWinterTires) {
        this.isWinterTires = isWinterTires;
    }

    public void setTireChange() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.isWinterTires = currentMonth < 5 || currentMonth > 10;
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }
    private boolean isCharacter(char symbol) {
        String symbols = "ABECKMHOPCTYX";
        return symbols.contains("" + symbol);
    }
    public boolean isRegNumberValid() {
        if (this.registrationNumber.length() != 9) {
            return false;
        }
        char[] regNumbersChar = this.registrationNumber.toCharArray();
        return isCharacter(regNumbersChar[0]) &&
                isNumber(regNumbersChar[1]) &&
                isNumber(regNumbersChar[2]) &&
                isNumber(regNumbersChar[3]) &&
                isCharacter(regNumbersChar[4]) &&
                isCharacter(regNumbersChar[5]) &&
                isNumber(regNumbersChar[6]) &&
                isNumber(regNumbersChar[7]) &&
                isNumber(regNumbersChar[8]);
    }

    public static class Key {
        private final boolean keyLessStart;
        private final boolean remoteEngineStart;

        public Key(boolean keyLessStart, boolean remoteEngineStart) {
            this.keyLessStart = keyLessStart;
            this.remoteEngineStart = remoteEngineStart;
        }

        public boolean isKeyLessStart() {
            return keyLessStart;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final float insuranceCost;
        private final String insuranceNumber;

        public Insurance(LocalDate validUntil, float insuranceCost, String insuranceNumber) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.insuranceCost = insuranceCost > 0 ? insuranceCost : 1;
            this.insuranceNumber = ValidationUtils.validOrDefault(insuranceNumber, "default");
        }

        boolean isNumberValid() {
            return this.insuranceNumber.length() == 9;
        }

        boolean isInsuranceValid(LocalDate validUntil) {
            return LocalDate.now().isBefore(this.validUntil);


        }
    }

}
