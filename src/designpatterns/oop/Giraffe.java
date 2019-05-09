package designpatterns.oop;

public class Giraffe extends Creature {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void setWeight(int weight) {

    }
}
