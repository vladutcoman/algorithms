package designpatterns.decorator;

public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");
        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", mozzarella";
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost() + .40;
    }
}
