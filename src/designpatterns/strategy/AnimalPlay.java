package designpatterns.strategy;

public class AnimalPlay {

    public static void main(String[] args) {

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.getFlyingType());
        System.out.println("Bird: " + tweety.getFlyingType());

        sparky.setFlyingType(new ItFlys());

        System.out.println("Dog: " + sparky.getFlyingType());

    }

}
