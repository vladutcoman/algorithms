package designpatterns.template;

public class SandwichSculptor {

    public static void main(String[] args) {

        Hoagie italian = new ItalianHoagie();
        italian.makeSandwich();

        System.out.println("\n");

        Hoagie veggie = new VegetableHoagie();
        veggie.makeSandwich();
    }

}
