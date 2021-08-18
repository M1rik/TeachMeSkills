package Unit6;

public class Passenger extends LandTransport{
    String bodyType;
    int numberOfPassengers;
    double powerKw = 0.74;

    public Passenger(double enginePower, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption, String bodyType, int numberOfPassengers) {
        super(enginePower, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;

    }

    @Override
    public void info() {
        super.info();
        System.out.print(" Тип кузова: " + bodyType + " Количество пассажиров: " + numberOfPassengers + " Мощность в Кв: " + enginePower*powerKw);
    }

    public static void main(String[] args) {
        Passenger p = new Passenger(200,200,200,"f",4,2.6,"f",4);
        p.info();
    }
}
