package Unit7.hands;

public class SonyHand implements IHand{


    int price;

    public SonyHand() {
    }

    public SonyHand(int price) {
        this.price = price;
    }


    @Override
    public void upHand() {
        System.out.println("Рука от sony двигается");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
