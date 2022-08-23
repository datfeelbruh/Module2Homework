package task1.animals;

import task1.interfaces.Bitable;

public class Tiger implements Bitable {
    @Override
    public void bite() {
        System.out.println("Тигр кусает");
    }
}
