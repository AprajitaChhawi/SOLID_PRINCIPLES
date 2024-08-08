package Open_Close_Principal;

import Single_Responsibility_Principle.Animal;

import java.net.SocketOption;

public abstract class Bird extends Animal {
    @Override
    public void run() {
        System.out.println("birds are running");
    }
    public abstract void fly(); //but will all birds fly(penguin)
}
