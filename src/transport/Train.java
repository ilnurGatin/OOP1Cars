package transport;

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
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
    }
}
