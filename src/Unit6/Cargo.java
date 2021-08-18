package Unit6;

public class Cargo extends LandTransport{
    double liftingCapacity;
    double powerKw = 0.74;


    public Cargo(double enginePower, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption, double liftingCapacity) {
        super(enginePower, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Грузоподъёмность: " + liftingCapacity + " Мощность в Кв: " + enginePower*powerKw);
    }
}
