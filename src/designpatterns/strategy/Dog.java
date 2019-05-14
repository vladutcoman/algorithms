package designpatterns.strategy;

public class Dog extends Animal {
    public Dog() {
        super();

        setSound("Bark!");

        setFlyingType(new CantFly());
    }
}
