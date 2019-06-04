package designpatterns.template;

public abstract class Hoagie {

    final void makeSandwich() {
        cutBun();

        if (customerWantsMeet()) {
            System.out.println("\n");
            addMeat();
        }

        if (customerWantsCheese()) {
            System.out.println("\n");
            addCheese();
        }

        if (customerWantsVegetables()) {
            System.out.println("\n");
            addVegetables();
        }

        if (customerWantsCondiments()) {
            System.out.println("\n");
            addCondiments();
        }

        wrapTheHoagie();
    }

    public void cutBun() {
        System.out.println("Cut bun");
    }

    public void wrapTheHoagie() {
        System.out.println("Wrap the hoagie");
    }

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();

    boolean customerWantsMeet() { return true; }
    boolean customerWantsCheese() { return true; }
    boolean customerWantsVegetables() { return true; }
    boolean customerWantsCondiments() { return true; }
}
