package Unit6;

public class LandTransport extends Transport {
    int numberOfWheels;
    double fuelConsumption;

    public LandTransport(double enginePower, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption) {
        super(enginePower, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void info() {
        super.info();
        System.out.print("Количество колёс: " + numberOfWheels + " Расход топлива на 100 км.: " + fuelConsumption + " ");
    }
}

