import task1.Zoo;
import task1.animals.*;
import task2.MyList;

public class Homework {
    public static void main(String[] args) {
        // Task1
        Duck duck = new Duck();
        Goose goose = new Goose();
        Penguin penguin = new Penguin();
        Shark shark = new Shark();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        Zoo<Duck, Penguin, Lion> zoo1 = new Zoo<>();
        Zoo<Goose, Shark, Tiger> zoo2 = new Zoo<>();

        zoo1.setFlyingAnimal(duck);
        zoo1.setSwimmingAnimal(penguin);
        zoo1.setBitingAnimal(lion);

        zoo1.feedFlyable();
        zoo1.feedSwimable();
        zoo1.feedBitable();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        zoo2.setFlyingAnimal(goose);
        zoo2.setSwimmingAnimal(shark);
        zoo2.setBitingAnimal(tiger);

        zoo2.feedFlyable();
        zoo2.feedSwimable();
        zoo2.feedBitable();

        Duck newDuck = zoo1.getFlyingAnimal();
        Goose newGoose = zoo2.getFlyingAnimal();
        Penguin newPenguin = zoo1.getSwimmingAnimal();
        Shark newShark = zoo2.getSwimmingAnimal();
        Lion newLion = zoo1.getBitingAnimal();
        Tiger newTiger = zoo2.getBitingAnimal();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        newDuck.fly();
        newGoose.fly();
        newPenguin.swim();
        newShark.swim();
        newLion.bite();
        newTiger.bite();

        //Task2
        MyList<Duck> list = new MyList<>();
        list.add(new Duck());
        list.add(new Duck());
        list.add(new Duck());
        System.out.println(list);
        list.add(new Duck());
        System.out.println(list);
        Duck duck1 = list.get(1);
        boolean b = list.add(new Duck());
        System.out.println(b);
        duck1.fly();


    }
}