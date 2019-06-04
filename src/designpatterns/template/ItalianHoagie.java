package designpatterns.template;

public class ItalianHoagie extends Hoagie {

    String[] meatUsed = { "Salami", "Pepperoni" };
    String[] cheeseUsed = { "Provolone" };
    String[] vegetablesUsed = { "Tomatoes", "Onions" };
    String[] condimentsUsed = { "Salt", "Oil" };

    @Override
    void addMeat() {
        System.out.println("Adding meat: ");
        for (String item : meatUsed) {
            System.out.println(" " + item);
        }
    }

    @Override
    void addCheese() {
        System.out.println("Adding cheese: ");
        for (String item : cheeseUsed) {
            System.out.println(" " + item);
        }
    }

    @Override
    void addVegetables() {
        System.out.println("Adding vegetables: ");
        for (String item : vegetablesUsed) {
            System.out.println(" " + item);
        }
    }

    @Override
    void addCondiments() {
        System.out.println("Adding condiments: ");
        for (String item : condimentsUsed) {
            System.out.println(" " + item);
        }
    }
}
