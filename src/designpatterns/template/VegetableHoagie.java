package designpatterns.template;

public class VegetableHoagie extends Hoagie {

    String[] vegetablesUsed = { "Tomatoes", "Onions" };
    String[] condimentsUsed = { "Salt", "Oil" };

    boolean customerWantsMeet() { return false; }
    boolean customerWantsCheese() { return false; }

    @Override
    void addMeat() {}

    @Override
    void addCheese() {}

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
