package designpatterns.decorator;

public class Sauce extends ToppingDecorator {
    public Sauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", sauce";
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost() + .99;
    }
}
