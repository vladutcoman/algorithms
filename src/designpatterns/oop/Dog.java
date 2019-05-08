package designpatterns.oop;

import java.sql.SQLOutput;

public class Dog extends Animal {

    public void digHole() {
        System.out.println("Dog dig");
    }

    public Dog() {
        super();

        setSound("Bark");
    }

    public void changeVar(int var) {
        var = 12;

        System.out.println("Met var: " + var);
    }
}
