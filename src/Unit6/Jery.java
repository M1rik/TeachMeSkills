package Unit6;

public class Jery extends MoveToBeEaten{
    @Override
    void move() {
        System.out.println("Jery move");
    }

    @Override
    void toBeEaten() {
        System.out.println("Jery to be eaten");
    }
}
