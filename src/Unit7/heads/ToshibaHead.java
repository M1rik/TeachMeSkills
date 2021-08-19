package Unit7.heads;

public class ToshibaHead implements IHead{
    int price;

    public ToshibaHead() {
    }

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Голова говорит Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
