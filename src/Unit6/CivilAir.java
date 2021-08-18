package Unit6;

public class CivilAir extends AirTransport {

    int numberOfPassengers;
    boolean businessClass;
    double powerKw = 0.74;

    public CivilAir(double enginePower, double maxSpeed, double weight, String brand, double wingspan, int runwayLength, int numberOfPassengers, boolean businessClass) {
        super(enginePower, maxSpeed, weight, brand, wingspan, runwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public void info() {
        super.info();
        System.out.print(" Количество пассажиров: " + numberOfPassengers + " Наличие бизнес класса: " + businessClass + " Мощность в Кв: " + enginePower*powerKw);
    }
}
