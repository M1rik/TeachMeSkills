package Unit6;

public class Spyke extends MoveEat{
    @Override
    void move() {
        System.out.println("Spyke move");
    }

    @Override
    void eat() {
        System.out.println("Spyke eat");
    }
}
