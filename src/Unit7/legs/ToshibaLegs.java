package Unit7.legs;

public class ToshibaLegs implements ILeg{

    int price;

    public ToshibaLegs() {
    }

    public ToshibaLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Ноги от Toshiba двигаются");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
