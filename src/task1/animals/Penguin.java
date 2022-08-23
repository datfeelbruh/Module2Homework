package task1.animals;

import task1.interfaces.Swimable;

public class Penguin implements Swimable {
    @Override
    public void swim() {
        System.out.println("Пингвин плывет");
    }
}
