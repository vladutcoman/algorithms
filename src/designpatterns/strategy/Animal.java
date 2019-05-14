package designpatterns.strategy;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String sound;

    public Flys flyingType;

    public Animal() {}

    public Animal(String name, double height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFlyingType() {
        return flyingType.flys();
    }

    public void setFlyingType(Flys flyingType) {
        this.flyingType = flyingType;
    }
}
