package Unit7.hands;

public class SamsungHand implements IHand{

    int price;

    public SamsungHand() {
    }

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука от Samsung двигается");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
