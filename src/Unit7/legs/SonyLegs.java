package Unit7.legs;

public class SonyLegs implements ILeg{

    int price;

    public SonyLegs() {
    }

    public SonyLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Ноги от Sony двигаются");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
