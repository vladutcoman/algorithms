package designpatterns.oop;

abstract public class Creature {

    protected String name;
    protected int weight;
    protected String sound;

    public abstract String getName();
    public abstract void setName(String name);

    public abstract int getWeight();
    public abstract void setWeight(int weight);
}
