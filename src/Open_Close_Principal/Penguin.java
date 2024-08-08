package Open_Close_Principal;

import Single_Responsibility_Principle.Animal;

import java.net.SocketOption;

public class Penguin extends Animal implements Flyable {
    @Override
    public void run() {
        System.out.println("i am walking very slowly though");
    }
    @Override
    public void fly(){
        System.out.println("i can't fly");
    }
}
