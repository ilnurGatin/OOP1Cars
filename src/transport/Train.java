package transport;

import java.util.Objects;

public class Train extends Transport{
    private double ticketCost;
    private float travelTimeInHours;
    private String departureStation;
    private String arrivalStation;
    private int carriageAmount;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
                 double ticketCost, float travelTimeInHours, String departureStation, String arrivalStation,
                 int carriageAmount) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        setTicketCost(ticketCost);
        setTravelTimeInHours(travelTimeInHours);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setCarriageAmount(carriageAmount);
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost > 0 ? ticketCost : 1;
    }

    public float getTravelTimeInHours() {
        return travelTimeInHours;
    }

    public void setTravelTimeInHours(float travelTimeInHours) {
        this.travelTimeInHours = travelTimeInHours > 0 ? travelTimeInHours : 1;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = ValidationUtils.validOrDefault(departureStation, "default") ;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = ValidationUtils.validOrDefault(arrivalStation, "default");
    }

    public int getCarriageAmount() {
        return carriageAmount;
    }

    public void setCarriageAmount(int carriageAmount) {
        this.carriageAmount = carriageAmount > 0 ? carriageAmount : 1;
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
    }

    @Override
    public String toString() {
        return "Train{" +
                "ticketCost=" + ticketCost +
                ", travelTimeInHours=" + travelTimeInHours +
                ", departureStation='" + departureStation + '\'' +
                ", arrivalStation='" + arrivalStation + '\'' +
                ", carriageAmount=" + carriageAmount +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Double.compare(train.ticketCost, ticketCost) == 0 && Float.compare(train.travelTimeInHours, travelTimeInHours) == 0 && carriageAmount == train.carriageAmount && Objects.equals(departureStation, train.departureStation) && Objects.equals(arrivalStation, train.arrivalStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketCost, travelTimeInHours, departureStation, arrivalStation, carriageAmount);
    }
}
