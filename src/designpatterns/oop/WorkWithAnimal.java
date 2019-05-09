package designpatterns.oop;

public class WorkWithAnimal {

    public static void main(String[] args) {

        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(-1);

        int var = 20;

        fido.changeVar(var);

        System.out.println("Principal var: " + var);

        changeObjName(fido);

        System.out.println(fido.getName());

        System.out.println("============ 2 ==============");

        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("Dog1: " + dog.getSound());
        System.out.println("Cat1: " + cat.getSound());

        speakAnimal(dog);
        speakAnimal(cat);

        fido.accessPrivate();

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Giraffe");

        System.out.println("Giraffe: " + giraffe.getName());


    }

    public static void changeObjName(Dog fido) {
        fido.setName("Marcus");
    }

    public static void speakAnimal(Animal randAnimal) {
        System.out.println("SpeakAnimal: " + randAnimal.getSound());
    }

}
