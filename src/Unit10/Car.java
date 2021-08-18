package Unit10;

import java.util.Random;

public class Car {

    String brand;
    int speed;
    double price;

    public Car() {
    }

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() throws WrongEngine {
        Random r = new Random();
        int a = r.nextInt(21);
        if(a % 2 == 0){
            throw new WrongEngine("не завелось");
        }else {
            System.out.println("well");
        }

    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        ready(c1);
        ready(c2);
        ready(c3);
    }

    private static void ready(Car c1) {
        try {
            c1.start();
        } catch (WrongEngine e) {
            e.printStackTrace();
        }
    }
}
