package Homework1.task2;

import java.util.Arrays;

public class MyList<T>  {
    T[] objects;
    int size;
    int index;

    public MyList() {
        this.objects = (T[]) new Object[3];
        this.size = 3;
        this.index = 0;
    }

    public boolean add(T elem) {
        if (index == size) {
            T[] newObjects;
            newObjects = (T[]) new Object[size * 2];
            System.arraycopy(objects, 0, newObjects, 0, index);
            this.objects = newObjects;
        }
        objects[index] = elem;
        index++;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(objects, 0, index));
    }

    public T get(int index) {
        return objects[index];
    }
}
