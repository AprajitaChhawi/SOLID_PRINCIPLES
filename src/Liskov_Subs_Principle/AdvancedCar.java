package Liskov_Subs_Principle;

public class AdvancedCar extends BasicCar{
    @Override
    public void run() {
        System.out.println("Advance Engine running");
    }
}
