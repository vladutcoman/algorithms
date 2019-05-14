package designpatterns.strategy;

public class Bird extends Animal {

    public Bird() {
        super();

        setSound("tweet!");
        setFlyingType(new ItFlys());
    }
}
