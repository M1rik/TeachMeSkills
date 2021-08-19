package Unit7.heads;

public class SamsungHead implements IHead{

    int price;

    public SamsungHead() {
    }

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Голова говорит Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
