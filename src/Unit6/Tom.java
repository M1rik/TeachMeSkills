package Unit6;

public class Tom extends MoveEatToBeEaten{
    @Override
    void move() {
        System.out.println("Tom move");
    }

    @Override
    void Eat() {
        System.out.println("Tom eat");
    }

    @Override
    void toBeEaten() {
        System.out.println("Tom to be eaten");
    }
}
