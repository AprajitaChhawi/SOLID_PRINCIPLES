package Open_Close_Principal;

import Single_Responsibility_Principle.Animal;

//only implement flyable interface when you know the object will use it
public class Vulture extends Animal implements Flyable {
    @Override
    public void run() {
        System.out.println("i walk slowly");
    }

    @Override
    public void fly() {
        System.out.println("flying vulture");
    }
}
