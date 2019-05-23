package designpatterns.prototype;

public class TestCloning {

    public static void main(String[] args) {

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(System.identityHashCode(sally));
        System.out.println(clonedSheep);
        System.out.println(System.identityHashCode(clonedSheep));

    }

}
