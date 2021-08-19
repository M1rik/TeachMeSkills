package Unit7.hands;

public class ToshibaHand implements IHand {

    int price;

    public ToshibaHand() {
    }

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука от Toshiba двигается");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
