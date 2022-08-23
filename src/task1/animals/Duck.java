package task1.animals;

import task1.interfaces.Flyable;

public class Duck implements Flyable {
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }
}
