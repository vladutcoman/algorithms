package designpatterns.decorator;

public class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost();
    }
}
