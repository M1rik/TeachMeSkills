package Unit6;

import org.w3c.dom.ls.LSOutput;

public class Transport {
    double enginePower;
    double maxSpeed;
    double weight;
    String brand;


    public Transport(double enginePower, double maxSpeed, double weight, String brand) {
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
    public void info(){
        System.out.print("Бренд автомобиля: " + brand + " Максимальная скорость: " + maxSpeed + " Вес автомобиля: " + weight + " Мощность двигателя: " + enginePower + " ");
    }
}

