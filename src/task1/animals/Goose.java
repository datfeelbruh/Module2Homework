package task1.animals;

import task1.interfaces.Flyable;

public class Goose implements Flyable {
    @Override
    public void fly() {
        System.out.println("Гусь летит");
    }
}
