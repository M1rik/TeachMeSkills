package Unit6;

public class MilitaryAir extends AirTransport{

    boolean ejectionSystem;
    int numberOfMissiles;
    double powerKw = 0.74;


    public MilitaryAir(double enginePower, double maxSpeed, double weight, String brand, double wingspan, int runwayLength, boolean ejectionSystem, int numberOfMissiles) {
        super(enginePower, maxSpeed, weight, brand, wingspan, runwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissiles = numberOfMissiles;

    }

    @Override
    public void info() {
        super.info();
        System.out.print("Наличие системы катапультирования: " + ejectionSystem + " Количество ракет на борту: " + numberOfMissiles + " Мощность в Кв: " + enginePower*powerKw);

    }

}
