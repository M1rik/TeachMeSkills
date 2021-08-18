package Unit6;

public class AirTransport extends Transport {

    double wingspan;
    int runwayLength;

    public AirTransport(double enginePower, double maxSpeed, double weight, String brand, double wingspan, int runwayLength) {
        super(enginePower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;
    }

    @Override
    public void info() {
        super.info();
        System.out.print("Размах крыльев: " + wingspan + " Минимальная длина взлётной полосы: " + runwayLength + " ");
    }
}
