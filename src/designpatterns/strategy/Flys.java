package designpatterns.strategy;

public interface Flys {

    public String flys();

}

class ItFlys implements Flys{

    public String flys() {
        return "It's flying!";
    }

}

class CantFly implements Flys {

    public String flys() {
        return "Can't fly!";
    }

}
