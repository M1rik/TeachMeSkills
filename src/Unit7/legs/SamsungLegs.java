package Unit7.legs;

public class SamsungLegs implements ILeg{

    int price;

    public SamsungLegs() {
    }

    public SamsungLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Ноги от Samsung двигаются");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
