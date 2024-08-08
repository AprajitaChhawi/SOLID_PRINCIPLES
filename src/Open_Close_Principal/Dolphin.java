package Open_Close_Principal;

import Single_Responsibility_Principle.Animal;

public class Dolphin extends Animal {
    @Override
    public void run() {
        System.out.println("I can't run");
    }
}
