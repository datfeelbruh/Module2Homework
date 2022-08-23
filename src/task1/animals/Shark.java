package task1.animals;

import task1.interfaces.Swimable;

public class Shark implements Swimable {
    @Override
    public void swim() {
        System.out.println("Акула плывет");
    }
}
