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

        Animal dog = new Dog();
        Animal cat = new Cat();


    }

    public static void changeObjName(Dog fido) {
        fido.setName("Marcus");
    }

}
